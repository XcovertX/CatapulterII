package com.utility;
//package utility;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
// 
//import com.google.gson.TypeAdapter;
//import com.google.gson.stream.JsonReader;
//import com.google.gson.stream.JsonToken;
//import com.google.gson.stream.JsonWriter;
//
//import objects.Thing;
// 
//public class CustomTypeAdapter extends TypeAdapter< Thing > {
// 
//    @Override
//    public void write(JsonWriter writer, Thing thing ) throws IOException {
//        writer.beginObject();
// 
//        writer.name("mark").value(car.getMark());
//        writer.name("model").value(car.getModel());
//        writer.name("type").value(car.getType());
//        writer.name("maker").value(car.getMaker());
// 
//        double costIncludingVAT = car.getCost() + 0.21 * car.getCost();// Add 21% VAT
//        writer.name("cost").value(costIncludingVAT);
// 
//        writer.name("colors");
//        writer.beginArray();
//        for (String color : car.getColors()) {
//            writer.value(color);
//        }
//        writer.endArray();
//        writer.endObject();
//        writer.close();
//    }
// 
//    @Override
//    public Car4 read(JsonReader reader) throws IOException {
// 
//        Car4 car = new Car4();
//        reader.beginObject();
//        while (reader.hasNext()) {
//            String name = reader.nextName();
//            if (name.equals("mark")) {
//                car.setMark(reader.nextString());
//            } else if (name.equals("model")) {
//                car.setModel(reader.nextInt());
//            } else if (name.equals("type")) {
//                car.setType(reader.nextString());
//            } else if (name.equals("maker")) {
//                car.setType(reader.nextString());
//            } else if (name.equals("cost")) {
//                double cost = reader.nextDouble();
//                double costExcludingVAT = cost / 1.21;
//                car.setCost(costExcludingVAT);  //Remove VAT 21%
//            } else if (name.equals("colors") && reader.peek() != JsonToken.NULL) {
//                car.setColors(readStringArray(reader));
//            } else {
//                reader.skipValue();
//            }
//        }
//        reader.endObject();
//        return car;
//    }
// 
//    public List<String> readStringArray(JsonReader reader) throws IOException {
//        List<String> colors = new ArrayList<String>();
// 
//        reader.beginArray();
//        while (reader.hasNext()) {
//            colors.add(reader.nextString());
//        }
//        reader.endArray();
//        return colors;
//    }
//}
