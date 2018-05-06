package com.org.bu.app.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opencsv.CSVReader;
import com.org.bu.app.config.Config;
import com.org.bu.app.config.ConfigService;
import com.org.bu.app.dao.LoadDao;

@Service
public class LoadService extends BaseService {

	private static final String DOT = ".";

	@Autowired
	private LoadDao loadDao;
	
	@Autowired
	private ConfigService configService;

	public void insert(String file) {

		CSVReader reader;
		try {
			Config config = configService.findById(file);
			
			reader = new CSVReader(new FileReader(config.getSource()));

			List<String[]> items = readAll(reader);

			List<List<String>> rows = transform(items);
			
			loadDao.insert(rows, config);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private <T> List<List<T>> transform(List<T[]> items) {
		int colCount = size(first(items));

		List<List<T>> rows = new ArrayList<List<T>>();
		for (T[] item : items) {
			List<T> cols = new ArrayList<T>();
			for (int colIndex = 0; colIndex < colCount; colIndex++) {
				T colContent = get(item, colIndex);
				cols.add((T) colContent);
			}
			rows.add(cols);
		}

		return rows;
	}

	private <T> T get(T[] item, int index) {
		return (size(item) > index ? item[index] : null);
	}

	private <T> int size(T[] item) {
		return (item == null ? 0 : item.length);
	}

	private <T> T first(List<T> items) {
		return (items == null || items.size() == 0 ? null : items.get(0));
	}

	private List<String[]> readAll(CSVReader reader) {
		List<String[]> items = null;
		try {
			items = reader.readAll();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return items;
	}

}
