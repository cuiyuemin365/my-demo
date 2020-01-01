package com.admin.excel.demo;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoApplication {

    public static void main(String[] args) throws Exception {
        File file = new File("/data/project/demo/exceldemo/1.xlsx");
        file.createNewFile();
        ExcelWriter writer = new ExcelWriter(new FileOutputStream(file), ExcelTypeEnum.XLSX);
        Sheet sheet = new Sheet(1, 0);
        sheet.setSheetName("12323");
        List<List<String>> head = new ArrayList<>();
        head.add(new ArrayList<>(Arrays.asList("a", "b", "c")));
        sheet.setHead(head);
		List<List<Object>> data = new ArrayList<>();
		data.add(new ArrayList<>(Arrays.asList("1",2,342)));
        writer.write1(data, sheet);
        writer.finish();
    }

}
