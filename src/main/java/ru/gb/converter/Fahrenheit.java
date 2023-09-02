package ru.gb.converter;

/**Чтобы преобразовать градус Фаренгейта в градус Цельсия,
 * вычтите 32 из температуры Фаренгейта, а затем разделите свой ответ на 1,8. */
public class Fahrenheit {
    /**
     * Функция преобразования
     *
     * @param temperature число, требующее перевода
     * @return результат.
     */
    public float convert(float temperature) {
        return (temperature - 32) * 5/9;
    }
}
