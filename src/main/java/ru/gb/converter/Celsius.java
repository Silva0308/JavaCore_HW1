package ru.gb.converter;
/**
 * Класс, преобразующий градусы Цельсия в градусы Фаренгейта.
 * Чтобы преобразовать Градус Цельсия в градус Фаренгейта,
 * умножьте температуру Цельсия на 1,8, а затем добавьте 32 к своему ответу.
 */
public class Celsius {

    /**
     * Функция преобразования
     *
     * @param temperature число, требующее перевода
     * @return результат.
     */
    public float convert(float temperature) {
        return temperature * 9/5 + 32;}
}
