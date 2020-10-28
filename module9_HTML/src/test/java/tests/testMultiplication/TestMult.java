package tests.testMultiplication;

import dzmitry.klokau.testing.Calculator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class TestMult {
    private Calculator calculator;

    @BeforeTest
    public void setUp() throws IOException {
        calculator = new Calculator();
        ReadCsvDataMult.readSumData();
    }


    @Test
    public void testMultDoubleShortInt() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[0][0]);
        short a = Short.parseShort(ReadCsvDataMult.getDataMultArray()[0][1]);
        int b = Integer.parseInt(ReadCsvDataMult.getDataMultArray()[0][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleCharInt() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[1][0]);
        char a = (ReadCsvDataMult.getDataMultArray()[1][1]).charAt(0);
        int b = Integer.parseInt(ReadCsvDataMult.getDataMultArray()[1][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleByteInt() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[2][0]);
        byte a = Byte.parseByte(ReadCsvDataMult.getDataMultArray()[2][1]);
        int b = Integer.parseInt(ReadCsvDataMult.getDataMultArray()[2][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleLongInt() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[3][0]);
        long a = Long.parseLong(ReadCsvDataMult.getDataMultArray()[3][1]);
        int b = Integer.parseInt(ReadCsvDataMult.getDataMultArray()[3][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleDoubleFloat() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[4][0]);
        double a = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[4][1]);
        float b = Float.parseFloat(ReadCsvDataMult.getDataMultArray()[4][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleDoubleString() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[5][0]);
        double a = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[5][1]);
        String b = ReadCsvDataMult.getDataMultArray()[5][2];
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleDoubleShort() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[6][0]);
        double a = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[6][1]);
        short b = Short.parseShort(ReadCsvDataMult.getDataMultArray()[6][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleDoubleChar() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[7][0]);
        double a = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[7][1]);
        char b = (ReadCsvDataMult.getDataMultArray()[7][2]).charAt(0);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleDoubleByte() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[8][0]);
        double a = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[8][1]);
        byte b = Byte.parseByte(ReadCsvDataMult.getDataMultArray()[8][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleDoubleLong() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[9][0]);
        double a = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[9][1]);
        long b = Long.parseLong(ReadCsvDataMult.getDataMultArray()[9][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleLongDouble() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[10][0]);
        long a = Long.parseLong(ReadCsvDataMult.getDataMultArray()[10][1]);
        double b = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[10][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleFloatDouble() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[11][0]);
        float a = Float.parseFloat(ReadCsvDataMult.getDataMultArray()[11][1]);
        double b = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[11][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleStringDouble() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[12][0]);
        String a = ReadCsvDataMult.getDataMultArray()[12][1];
        double b = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[12][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleShortDouble() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[13][0]);
        short a = Short.parseShort(ReadCsvDataMult.getDataMultArray()[13][1]);
        double b = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[13][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleCharDouble() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[14][0]);
        char a = (ReadCsvDataMult.getDataMultArray()[14][1]).charAt(0);
        double b = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[14][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleByteDouble() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[15][0]);
        byte a = Byte.parseByte(ReadCsvDataMult.getDataMultArray()[15][1]);
        double b = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[15][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleFloatString() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[16][0]);
        float a = Float.parseFloat(ReadCsvDataMult.getDataMultArray()[16][1]);
        String b = ReadCsvDataMult.getDataMultArray()[16][2];
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleFloatShort() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[17][0]);
        float a = Float.parseFloat(ReadCsvDataMult.getDataMultArray()[17][1]);
        short b = Short.parseShort(ReadCsvDataMult.getDataMultArray()[17][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleFloatChar() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[18][0]);
        float a = Float.parseFloat(ReadCsvDataMult.getDataMultArray()[18][1]);
        char b = (ReadCsvDataMult.getDataMultArray()[18][2]).charAt(0);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleFloatByte() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[19][0]);
        float a = Float.parseFloat(ReadCsvDataMult.getDataMultArray()[19][1]);
        byte b = Byte.parseByte(ReadCsvDataMult.getDataMultArray()[19][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleFloatLong() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[20][0]);
        float a = Float.parseFloat(ReadCsvDataMult.getDataMultArray()[20][1]);
        long b = Long.parseLong(ReadCsvDataMult.getDataMultArray()[20][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleLongFloat() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[21][0]);
        long a = Long.parseLong(ReadCsvDataMult.getDataMultArray()[21][1]);
        float b = Float.parseFloat(ReadCsvDataMult.getDataMultArray()[21][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleStringFloat() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[22][0]);
        String a = ReadCsvDataMult.getDataMultArray()[22][1];
        float b = Float.parseFloat(ReadCsvDataMult.getDataMultArray()[22][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleShortFloat() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[23][0]);
        short a = Short.parseShort(ReadCsvDataMult.getDataMultArray()[23][1]);
        float b = Float.parseFloat(ReadCsvDataMult.getDataMultArray()[23][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleCharFloat() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[24][0]);
        char a = (ReadCsvDataMult.getDataMultArray()[24][1]).charAt(0);
        float b = Float.parseFloat(ReadCsvDataMult.getDataMultArray()[24][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleByteFloat() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[25][0]);
        byte a = Byte.parseByte(ReadCsvDataMult.getDataMultArray()[25][1]);
        float b = Float.parseFloat(ReadCsvDataMult.getDataMultArray()[25][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleStringShort() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[26][0]);
        String a = ReadCsvDataMult.getDataMultArray()[26][1];
        short b = Short.parseShort(ReadCsvDataMult.getDataMultArray()[26][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleStringChar() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[27][0]);
        String a = ReadCsvDataMult.getDataMultArray()[27][1];
        char b = (ReadCsvDataMult.getDataMultArray()[27][2]).charAt(0);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleStringByte() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[28][0]);
        String a = ReadCsvDataMult.getDataMultArray()[28][1];
        byte b = Byte.parseByte(ReadCsvDataMult.getDataMultArray()[28][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleStringLong() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[29][0]);
        String a = ReadCsvDataMult.getDataMultArray()[29][1];
        long b = Long.parseLong(ReadCsvDataMult.getDataMultArray()[29][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleLongString() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[30][0]);
        long a = Long.parseLong(ReadCsvDataMult.getDataMultArray()[30][1]);
        String b = ReadCsvDataMult.getDataMultArray()[30][2];
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleShortString() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[31][0]);
        short a = Short.parseShort(ReadCsvDataMult.getDataMultArray()[31][1]);
        String b = ReadCsvDataMult.getDataMultArray()[31][2];
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleCharString() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[32][0]);
        char a = (ReadCsvDataMult.getDataMultArray()[32][1]).charAt(0);
        String b = ReadCsvDataMult.getDataMultArray()[32][2];
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleByteString() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[33][0]);
        byte a = Byte.parseByte(ReadCsvDataMult.getDataMultArray()[33][1]);
        String b = ReadCsvDataMult.getDataMultArray()[33][2];
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleShortChar() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[34][0]);
        short a = Short.parseShort(ReadCsvDataMult.getDataMultArray()[34][1]);
        char b = (ReadCsvDataMult.getDataMultArray()[34][2]).charAt(0);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleShortByte() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[35][0]);
        short a = Short.parseShort(ReadCsvDataMult.getDataMultArray()[35][1]);
        byte b = Byte.parseByte(ReadCsvDataMult.getDataMultArray()[35][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleShortLong() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[36][0]);
        short a = Short.parseShort(ReadCsvDataMult.getDataMultArray()[36][1]);
        long b = Long.parseLong(ReadCsvDataMult.getDataMultArray()[36][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleLongShort() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[37][0]);
        long a = Long.parseLong(ReadCsvDataMult.getDataMultArray()[37][1]);
        short b = Short.parseShort(ReadCsvDataMult.getDataMultArray()[37][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleCharShort() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[38][0]);
        char a = (ReadCsvDataMult.getDataMultArray()[38][1]).charAt(0);
        short b = Short.parseShort(ReadCsvDataMult.getDataMultArray()[38][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleByteShort() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[39][0]);
        byte a = Byte.parseByte(ReadCsvDataMult.getDataMultArray()[39][1]);
        short b = Short.parseShort(ReadCsvDataMult.getDataMultArray()[39][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleCharByte() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[40][0]);
        char a = (ReadCsvDataMult.getDataMultArray()[40][1]).charAt(0);
        byte b = Byte.parseByte(ReadCsvDataMult.getDataMultArray()[40][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleCharLong() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[41][0]);
        char a = (ReadCsvDataMult.getDataMultArray()[41][1]).charAt(0);
        long b = Long.parseLong(ReadCsvDataMult.getDataMultArray()[41][2]);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleLongChar() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[42][0]);
        long a = Long.parseLong(ReadCsvDataMult.getDataMultArray()[42][1]);
        char b = (ReadCsvDataMult.getDataMultArray()[42][2]).charAt(0);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @Test
    public void testMultDoubleByteChar() {
        double expected = Double.parseDouble(ReadCsvDataMult.getDataMultArray()[43][0]);
        byte a = Byte.parseByte(ReadCsvDataMult.getDataMultArray()[43][1]);
        char b = (ReadCsvDataMult.getDataMultArray()[43][2]).charAt(0);
        assertEquals(expected, calculator.multiplication(a, b), 1e-15);
    }

    @AfterTest
    public void endTest() {
        calculator = null;
    }
}
