package com.sophossolutions.utilities;

import java.util.ArrayList;
import java.util.List;

public class SplitLists {

	public static List<List<String>> splitListList(List<List<String>> data, int index, int end) {

		List<List<String>> listToReturn = new ArrayList<List<String>>();

		for (int j = 0; j < data.size(); j++) {
			List<String> list = new ArrayList<String>();
			for (int i = index; i < end; i++) {

				list.add(data.get(j).get(i));

			}

			listToReturn.add(list);

		}

		return listToReturn;

	}
}
