package com.jx;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 */
public class Test {
    private static final String PATH = "./2020年1月中华人民共和国县以上行政区划代码.json";

    public static void main(String[] args) throws Exception {
        System.out.println("========== JSON ---> 转换成 SQL 开始 ==========");
        jsonToExcel();
        System.out.println("========== JSON ---> 转换成 SQL 结束 ==========");
    }

    private static void jsonToExcel() throws Exception {
        JsonParser jsonParser = new JsonParser();
        JsonArray jsonArray = (JsonArray) jsonParser.parse(new FileReader(PATH));
        int l = 0;
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement jsonElement = jsonArray.get(i);
            JsonObject featuresObj = jsonElement.getAsJsonObject();
            JsonElement cityList = featuresObj.get("cityList");
            JsonArray asJsonArray = cityList.getAsJsonArray();

            //县
//            for (int j = 0; j < asJsonArray.size(); j++) {
//                JsonElement jsonElement1 = asJsonArray.get(j);
//                JsonObject featuresObj1 = jsonElement1.getAsJsonObject();
//                JsonElement cityList2 = featuresObj1.get("areaList");
//                JsonArray asJsonArray2 = cityList2.getAsJsonArray();
//                for (int k = 0; k < asJsonArray2.size(); k++) {
//                    if (asJsonArray2 == null) {
//                        System.out.println("空");
//                        return;
//                    }
//                    JsonElement jsonElement2 = asJsonArray2.get(k);
//                    JsonObject featuresObj2 = jsonElement2.getAsJsonObject();
//                    String id = featuresObj1.get("code").toString();
//                    String name = featuresObj2.get("name").toString();
//                    String code = featuresObj2.get("code").toString();
//                    String sqlStr = "insert into areas (id, areaid, area, cityid) values (" + l + "," + code + "," + name + "," + id + "); \r\n";
//                    System.out.println(sqlStr);
//                    l++;
//                    File file = new File("./areas.sql");
//                    if (!file.exists()) {
//                        file.createNewFile();
//                    }
//                    FileWriter fileWriter = new FileWriter(file, true);
//                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//                    bufferedWriter.write(sqlStr);
//                    bufferedWriter.close();
//                }
//            }

            //市
//            for (int j = 0; j < asJsonArray.size(); j++) {
//                JsonElement jsonElement1 = asJsonArray.get(j);
//                JsonObject featuresObj1 = jsonElement1.getAsJsonObject();
//                String id = featuresObj.get("code").toString();
//                String name = featuresObj1.get("name").toString();
//                String code = featuresObj1.get("code").toString();
//                System.out.println(name);
//                String sqlStr = "insert into cities (id,cityid, city, provinceid) values ("+ l +","+ code +"," + name + ","+id+"); \r\n";
//                System.out.println(sqlStr);
//                l++;
//                System.out.println(l+"-----------------");
//             File file = new File("./cities.sql");
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            FileWriter fileWriter = new FileWriter(file, true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(sqlStr);
//            bufferedWriter.close();
//            }

            //省
//            String name = featuresObj.get("name").toString();
//            String id = featuresObj.get("code").toString();
//            String sqlStr = "insert into provinces (id,provinceid, province) values ("+ i +","+ id +"," + name + "); \r\n";
//            System.out.println(sqlStr);
//           // 地址要改
//            File file = new File("./provinces.sql");
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            FileWriter fileWriter = new FileWriter(file, true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(sqlStr);
//            bufferedWriter.close();
        }
    }

}