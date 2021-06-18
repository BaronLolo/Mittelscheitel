package dal;

import bll.Auto;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseManagerTest {

    @org.junit.jupiter.api.Test
    void getAllAutos() {
        List<Auto> list = new ArrayList<>(DataBaseManager.getInstance().getAllAutos());
        assertEquals(true, list.size() == 1);
    }
}