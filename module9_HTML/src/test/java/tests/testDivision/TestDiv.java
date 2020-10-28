package tests.testDivision;

import dzmitry.klokau.testing.Calculator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class TestDiv {
    private Calculator calculator;

    @BeforeTest
    public void setUp() throws IOException {
        calculator = new Calculator();
        ReadCsvDataDiv.readSumData();
    }


    @Test
    public void testDivDoubleShortInt() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[0][0]);
        short a = Short.parseShort(ReadCsvDataDiv.getDataDivArray()[0][1]);
        int b = Integer.parseInt(ReadCsvDataDiv.getDataDivArray()[0][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleCharInt() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[1][0]);
        char a = (ReadCsvDataDiv.getDataDivArray()[1][1]).charAt(0);
        int b = Integer.parseInt(ReadCsvDataDiv.getDataDivArray()[1][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleByteInt() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[2][0]);
        byte a = Byte.parseByte(ReadCsvDataDiv.getDataDivArray()[2][1]);
        int b = Integer.parseInt(ReadCsvDataDiv.getDataDivArray()[2][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleLongInt() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[3][0]);
        long a = Long.parseLong(ReadCsvDataDiv.getDataDivArray()[3][1]);
        int b = Integer.parseInt(ReadCsvDataDiv.getDataDivArray()[3][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleDoubleFloat() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[4][0]);
        double a = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[4][1]);
        float b = Float.parseFloat(ReadCsvDataDiv.getDataDivArray()[4][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleDoubleString() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[5][0]);
        double a = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[5][1]);
        String b = ReadCsvDataDiv.getDataDivArray()[5][2];
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleDoubleShort() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[6][0]);
        double a = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[6][1]);
        short b = Short.parseShort(ReadCsvDataDiv.getDataDivArray()[6][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleDoubleChar() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[7][0]);
        double a = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[7][1]);
        char b = (ReadCsvDataDiv.getDataDivArray()[7][2]).charAt(0);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleDoubleByte() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[8][0]);
        double a = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[8][1]);
        byte b = Byte.parseByte(ReadCsvDataDiv.getDataDivArray()[8][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleDoubleLong() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[9][0]);
        double a = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[9][1]);
        long b = Long.parseLong(ReadCsvDataDiv.getDataDivArray()[9][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleLongDouble() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[10][0]);
        long a = Long.parseLong(ReadCsvDataDiv.getDataDivArray()[10][1]);
        double b = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[10][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleFloatDouble() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[11][0]);
        float a = Float.parseFloat(ReadCsvDataDiv.getDataDivArray()[11][1]);
        double b = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[11][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleStringDouble() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[12][0]);
        String a = ReadCsvDataDiv.getDataDivArray()[12][1];
        double b = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[12][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleShortDouble() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[13][0]);
        short a = Short.parseShort(ReadCsvDataDiv.getDataDivArray()[13][1]);
        double b = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[13][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleCharDouble() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[14][0]);
        char a = (ReadCsvDataDiv.getDataDivArray()[14][1]).charAt(0);
        double b = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[14][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleByteDouble() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[15][0]);
        byte a = Byte.parseByte(ReadCsvDataDiv.getDataDivArray()[15][1]);
        double b = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[15][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleFloatString() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[16][0]);
        float a = Float.parseFloat(ReadCsvDataDiv.getDataDivArray()[16][1]);
        String b = ReadCsvDataDiv.getDataDivArray()[16][2];
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleFloatShort() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[17][0]);
        float a = Float.parseFloat(ReadCsvDataDiv.getDataDivArray()[17][1]);
        short b = Short.parseShort(ReadCsvDataDiv.getDataDivArray()[17][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleFloatChar() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[18][0]);
        float a = Float.parseFloat(ReadCsvDataDiv.getDataDivArray()[18][1]);
        char b = (ReadCsvDataDiv.getDataDivArray()[18][2]).charAt(0);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleFloatByte() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[19][0]);
        float a = Float.parseFloat(ReadCsvDataDiv.getDataDivArray()[19][1]);
        byte b = Byte.parseByte(ReadCsvDataDiv.getDataDivArray()[19][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleFloatLong() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[20][0]);
        float a = Float.parseFloat(ReadCsvDataDiv.getDataDivArray()[20][1]);
        long b = Long.parseLong(ReadCsvDataDiv.getDataDivArray()[20][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleLongFloat() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[21][0]);
        long a = Long.parseLong(ReadCsvDataDiv.getDataDivArray()[21][1]);
        float b = Float.parseFloat(ReadCsvDataDiv.getDataDivArray()[21][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleStringFloat() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[22][0]);
        String a = ReadCsvDataDiv.getDataDivArray()[22][1];
        float b = Float.parseFloat(ReadCsvDataDiv.getDataDivArray()[22][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleShortFloat() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[23][0]);
        short a = Short.parseShort(ReadCsvDataDiv.getDataDivArray()[23][1]);
        float b = Float.parseFloat(ReadCsvDataDiv.getDataDivArray()[23][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleCharFloat() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[24][0]);
        char a = (ReadCsvDataDiv.getDataDivArray()[24][1]).charAt(0);
        float b = Float.parseFloat(ReadCsvDataDiv.getDataDivArray()[24][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleByteFloat() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[25][0]);
        byte a = Byte.parseByte(ReadCsvDataDiv.getDataDivArray()[25][1]);
        float b = Float.parseFloat(ReadCsvDataDiv.getDataDivArray()[25][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleStringShort() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[26][0]);
        String a = ReadCsvDataDiv.getDataDivArray()[26][1];
        short b = Short.parseShort(ReadCsvDataDiv.getDataDivArray()[26][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleStringChar() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[27][0]);
        String a = ReadCsvDataDiv.getDataDivArray()[27][1];
        char b = (ReadCsvDataDiv.getDataDivArray()[27][2]).charAt(0);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleStringByte() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[28][0]);
        String a = ReadCsvDataDiv.getDataDivArray()[28][1];
        byte b = Byte.parseByte(ReadCsvDataDiv.getDataDivArray()[28][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleStringLong() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[29][0]);
        String a = ReadCsvDataDiv.getDataDivArray()[29][1];
        long b = Long.parseLong(ReadCsvDataDiv.getDataDivArray()[29][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleLongString() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[30][0]);
        long a = Long.parseLong(ReadCsvDataDiv.getDataDivArray()[30][1]);
        String b = ReadCsvDataDiv.getDataDivArray()[30][2];
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleShortString() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[31][0]);
        short a = Short.parseShort(ReadCsvDataDiv.getDataDivArray()[31][1]);
        String b = ReadCsvDataDiv.getDataDivArray()[31][2];
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleCharString() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[32][0]);
        char a = (ReadCsvDataDiv.getDataDivArray()[32][1]).charAt(0);
        String b = ReadCsvDataDiv.getDataDivArray()[32][2];
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleByteString() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[33][0]);
        byte a = Byte.parseByte(ReadCsvDataDiv.getDataDivArray()[33][1]);
        String b = ReadCsvDataDiv.getDataDivArray()[33][2];
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleShortChar() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[34][0]);
        short a = Short.parseShort(ReadCsvDataDiv.getDataDivArray()[34][1]);
        char b = (ReadCsvDataDiv.getDataDivArray()[34][2]).charAt(0);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleShortByte() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[35][0]);
        short a = Short.parseShort(ReadCsvDataDiv.getDataDivArray()[35][1]);
        byte b = Byte.parseByte(ReadCsvDataDiv.getDataDivArray()[35][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleShortLong() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[36][0]);
        short a = Short.parseShort(ReadCsvDataDiv.getDataDivArray()[36][1]);
        long b = Long.parseLong(ReadCsvDataDiv.getDataDivArray()[36][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleLongShort() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[37][0]);
        long a = Long.parseLong(ReadCsvDataDiv.getDataDivArray()[37][1]);
        short b = Short.parseShort(ReadCsvDataDiv.getDataDivArray()[37][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleCharShort() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[38][0]);
        char a = (ReadCsvDataDiv.getDataDivArray()[38][1]).charAt(0);
        short b = Short.parseShort(ReadCsvDataDiv.getDataDivArray()[38][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleByteShort() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[39][0]);
        byte a = Byte.parseByte(ReadCsvDataDiv.getDataDivArray()[39][1]);
        short b = Short.parseShort(ReadCsvDataDiv.getDataDivArray()[39][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleCharByte() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[40][0]);
        char a = (ReadCsvDataDiv.getDataDivArray()[40][1]).charAt(0);
        byte b = Byte.parseByte(ReadCsvDataDiv.getDataDivArray()[40][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleCharLong() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[41][0]);
        char a = (ReadCsvDataDiv.getDataDivArray()[41][1]).charAt(0);
        long b = Long.parseLong(ReadCsvDataDiv.getDataDivArray()[41][2]);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleLongChar() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[42][0]);
        long a = Long.parseLong(ReadCsvDataDiv.getDataDivArray()[42][1]);
        char b = (ReadCsvDataDiv.getDataDivArray()[42][2]).charAt(0);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test
    public void testDivDoubleByteChar() {
        double expected = Double.parseDouble(ReadCsvDataDiv.getDataDivArray()[43][0]);
        byte a = Byte.parseByte(ReadCsvDataDiv.getDataDivArray()[43][1]);
        char b = (ReadCsvDataDiv.getDataDivArray()[43][2]).charAt(0);
        assertEquals(expected, calculator.division(a, b), 1e-15);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivByZero() {
        int a = Integer.parseInt(ReadCsvDataDiv.getDataDivArray()[44][1]);
        int b = Integer.parseInt(ReadCsvDataDiv.getDataDivArray()[44][2]);
        calculator.division(a, b);
    }

    @AfterTest
    public void endTest() {
        calculator = null;
    }
}
