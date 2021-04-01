package org.example.DB;

public class OracleConnector implements DataBaseConnector {


    @Override
    public String create(String[] playload) {

        return "Записываем данные в базу Oracle";
    }

    @Override
    public String read(String[] playload) {
        return "Читаем данные в базы Oracle";
    }

    @Override
    public String updare(String[] playload) {
        return "Меняем данные в базе Oracle";
    }

    @Override
    public String delete(int num) {
        return "Удаляем строку " + num + " в базе Oracle";
    }
}
