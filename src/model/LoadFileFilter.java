package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LoadFileFilter extends InputSource {
    private String path;

    public LoadFileFilter(String path) {
        this.path = path;
    }

    @Override
    public boolean process(OutputStream outputStream) {
        try {
            if (new File(path).exists()) {
                StringBuilder buffer = new StringBuilder();
                String row;
                BufferedReader csvReader = new BufferedReader(new FileReader(path));
                while ((row = csvReader.readLine()) != null) {
                    buffer.append(row);
                }
                csvReader.close();
                outputStream.write(buffer.toString());
                return true;
            } else {
                throw new Exception("File could not be read");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
