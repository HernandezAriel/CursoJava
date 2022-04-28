package app;

import java.sql.Date;
import database.*;
import models.*;

public class Main {

    public static void main(String[] args) {

        Store store1 = new Store();
        store1.getInstance();
        Menu.menu(store1);

    }



}
