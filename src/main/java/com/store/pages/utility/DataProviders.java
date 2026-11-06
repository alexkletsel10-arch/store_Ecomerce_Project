package com.store.pages.utility;

import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
    @DataProvider(name = "storeSuccessReg")
    public Iterator<Object[]> storeSuccessReg() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/succesfullRegCsv.csv"))
        );

        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",");

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }

    @DataProvider(name = "storeInvalidEmailCsv")
    public Iterator<Object[]> storeInvalidEmailCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/InvalidEmailFieldCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",");

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "storeEmptyEmailFieldReg")
    public Iterator<Object[]> storeEmptyEmailCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/emptyEmailFieldCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "storeFirstNameFieldCsv")
    public Iterator<Object[]> storeFirstNameFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/emptyFirstNameFieldCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "storeLastNameFieldCsv")
    public Iterator<Object[]> storeLastNameFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/EmptyLastNameFieldCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "storeTooLongFirstNameFieldReg")
    public Iterator<Object[]> storeToLongFirstNameFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/tooLongFirstName.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "storeTooLongLastNameFieldCsv")
    public Iterator<Object[]> storeTooLongLastNameFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/tooLongLastNameFieldCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",");

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }

    @DataProvider(name = "storeTooLongTelephoneFieldCsv")
    public Iterator<Object[]> storeTooLongTelephoneFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/tooLongTelephoneFieldCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",", -1);

            list.add(new Object[]{split[0], split[1], split[2], split[3], split[4], split[5], split[6], split[7], split[8], split[9], split[10], split[11], split[12]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "storeEmptyAddress1FieldCsv")
    public Iterator<Object[]> storeEmptyAddress1FieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/emptyAddress1Field.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "storeShortAddress1FieldCsv")
    public Iterator<Object[]> storeShortyAddress1FieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/shortAddressField1Csv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",");

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "storeTooLongeAddress1FieldCsv")
    public Iterator<Object[]> storeTooLongeAddress1FieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/tooLongAddressField1Csv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",");

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "storeEmptyCityFieldCsv")
    public Iterator<Object[]> storeEmptyCityFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/emptyCityFieldRegCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }

        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "storeShortCityFieldCsv")
    public Iterator<Object[]> storeShortCityFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/emptyCityFieldRegCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",");

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }

        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "tooLongCityFieldCsv")
    public Iterator<Object[]> tooLongCityFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/tooLongCityFieldRegCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",");

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }

        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "emptyRegionFieldCsv")
    public Iterator<Object[]> emptyRegionFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/emptyRegionFieldRegCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }

        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "shortZipCodeFieldCsv")
    public Iterator<Object[]> shortZipCodeFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/shortZipCodeFieldRegCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }

        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "emptyZipCodeFieldCsv")
    public Iterator<Object[]> emptyZipCodeFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/emptyZipCodeFieldRegCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }

        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "emptyCountryFieldCsv")
    public Iterator<Object[]> emptyCountryFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/emptyCountryFieldRegCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }

        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "emptyLoginNameFieldCsv")
    public Iterator<Object[]> emptyLoginNameFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/emptyLoginNameFieldRegCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }

        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "invalidLoginNameFieldCsv")
    public Iterator<Object[]> invalidLoginNameFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/invalidLoginNameFieldRegCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",");

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12]}); // email, password

            line = reader.readLine();
        }

        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "pocoEmptyPasswordFieldCsv")
    public Iterator<Object[]> pocoEmptyPasswordFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/emptyPasswordFieldCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "pocoShortPasswordFieldCsv")
    public Iterator<Object[]> pocoShortPasswordFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/shortPasswordFieldCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "pocoMisMatchEmptyConfirmPasswordFieldCsv")
    public Iterator<Object[]> pocoEmptyConfirmPasswordFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/mismatchConfirmPasswordFieldCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "pocoMisMatchInvalidConfirmPasswordFieldCsv")
    public Iterator<Object[]> pocoMisMatchInvalidConfirmPasswordFieldCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/mismatchInvalidConfirmationPasswordFieldCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1],split[2],split[3],split[4],split[5]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "pocoSuccessLoginCsv")
    public Iterator<Object[]> pocoSuccessLoginCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/successfulLoginCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",");

            list.add(new Object[]{split[0],split[1]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }
    @DataProvider(name = "pocoInvalidLoginCsv")
    public Iterator<Object[]> pocoInvalidLoginCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/invalidLoginCsv.csv"))
        );
        String line = reader.readLine();
        while (line != null) {

            String[] split = line.split(",",-1);

            list.add(new Object[]{split[0],split[1]}); // email, password

            line = reader.readLine();
        }
        reader.close();
        return list.iterator();
    }



}
