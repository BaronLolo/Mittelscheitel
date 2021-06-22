package dal;

import bll.Auto;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseManagerTest {

    @org.junit.jupiter.api.Test
    void addAutos() {
        DataBaseManager.getInstance().addAuto(new Auto("Auto1", "Auto1",1, 1, 1, 1, "Auto1", "Auto1", "Auto1", "Auto1" ));
        List <Auto> list = new ArrayList<>(DataBaseManager.getInstance().getAllAutos());

        assertEquals(true, list.get(list.size() - 1).getName().equals("Auto1"));
    }

    @org.junit.jupiter.api.Test
    void getAllAutos() {
        List<Auto> list = new ArrayList<>(DataBaseManager.getInstance().getAllAutos());
        assertEquals(true, list.size() == 1);
    }

    @org.junit.jupiter.api.Test
    void getAllAutosContent() {
        List<Auto> list = new ArrayList<>(DataBaseManager.getInstance().getAllAutos());
        assertEquals(true, list.get(0).getMarke().equals("Nissan"));
    }

    @org.junit.jupiter.api.Test
    void updateAutosContent() {
        List<Auto> list = new ArrayList<>(DataBaseManager.getInstance().getAllAutos());
        list.get(0).setMarke("Toyota");
        DataBaseManager.getInstance().updateAuto(list.get(0));
        list = DataBaseManager.getInstance().getAllAutos();
        assertEquals(true, list.get(0).getMarke().equals("Toyota"));
    }

    @org.junit.jupiter.api.Test
    void deleteAutosContent() {
        List<Auto> list = new ArrayList<>(DataBaseManager.getInstance().getAllAutos());
        DataBaseManager.getInstance().deleteAuto(list.get(0));
        list = DataBaseManager.getInstance().getAllAutos();
        assertEquals(true, list.size() == 0);
    }







}