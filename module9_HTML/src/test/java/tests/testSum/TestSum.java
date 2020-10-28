package tests.testSum;

import dzmitry.klokau.testing.Calculator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class TestSum {
    private Calculator calculator;

    @BeforeTest
    public void setUp() throws IOException {
        calculator = new Calculator();
        ReadCsvDataSum.readSumData();
    }

    @Test
    public void testSumIntIntInt() {
        int expected = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[0][0]);
        int a = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[0][1]);
        int b = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[0][2]);
        assertEquals(expected, calculator.sum(a, b));
    }

    @Test
    public void testSumIntDoubleDouble() {
        int expected = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[1][0]);
        double a = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[1][1]);
        double b = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[1][2]);
        assertEquals(expected, calculator.sum(a, b));
    }

    @Test
    public void testSumFloatFloatFloat() {
        float expected = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[2][0]);
        float a = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[2][1]);
        float b = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[2][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumFloatStringString() {
        float expected = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[3][0]);
        String a = ReadCsvDataSum.getDataSumArray()[3][1];
        String b = ReadCsvDataSum.getDataSumArray()[3][2];
        assertEquals(expected, calculator.sum(a, b), 1e-1);
    }

    @Test
    public void testSumIntShortShort() {
        int expected = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[4][0]);
        short a = Short.parseShort(ReadCsvDataSum.getDataSumArray()[4][1]);
        short b = Short.parseShort(ReadCsvDataSum.getDataSumArray()[4][2]);
        assertEquals(expected, calculator.sum(a, b));
    }

    @Test
    public void testSumIntCharChar() {
        int expected = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[5][0]);
        char a = (ReadCsvDataSum.getDataSumArray()[5][1]).charAt(0);
        char b = (ReadCsvDataSum.getDataSumArray()[5][2]).charAt(0);
        assertEquals(expected, calculator.sum(a, b));
    }

    @Test
    public void testSumIntByteByte() {
        int expected = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[6][0]);
        byte a = Byte.parseByte(ReadCsvDataSum.getDataSumArray()[6][1]);
        byte b = Byte.parseByte(ReadCsvDataSum.getDataSumArray()[6][2]);
        assertEquals(expected, calculator.sum(a, b));
    }

    @Test
    public void testSumLongLongLong() {
        long expected = Long.parseLong(ReadCsvDataSum.getDataSumArray()[7][0]);
        long a = Long.parseLong(ReadCsvDataSum.getDataSumArray()[7][1]);
        long b = Long.parseLong(ReadCsvDataSum.getDataSumArray()[7][2]);
        assertEquals(expected, calculator.sum(a, b));
    }

    @Test
    public void testSumDoubleIntDouble() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[8][0]);
        int a = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[8][1]);
        double b = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[8][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleIntFloat() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[9][0]);
        int a = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[9][1]);
        float b = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[9][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleIntString() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[10][0]);
        int a = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[10][1]);
        String b = ReadCsvDataSum.getDataSumArray()[10][2];
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleIntShort() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[11][0]);
        int a = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[11][1]);
        short b = Short.parseShort(ReadCsvDataSum.getDataSumArray()[11][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleIntChar() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[12][0]);
        int a = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[12][1]);
        char b = (ReadCsvDataSum.getDataSumArray()[12][2]).charAt(0);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleIntByte() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[13][0]);
        int a = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[13][1]);
        byte b = Byte.parseByte(ReadCsvDataSum.getDataSumArray()[13][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleIntLong() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[14][0]);
        int a = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[14][1]);
        long b = Long.parseLong(ReadCsvDataSum.getDataSumArray()[14][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleDoubleInt() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[15][0]);
        double a = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[15][1]);
        int b = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[15][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleFloatInt() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[16][0]);
        float a = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[16][1]);
        int b = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[16][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleStringInt() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[17][0]);
        String a = ReadCsvDataSum.getDataSumArray()[17][1];
        int b = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[17][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleShortInt() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[18][0]);
        short a = Short.parseShort(ReadCsvDataSum.getDataSumArray()[18][1]);
        int b = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[18][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleCharInt() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[19][0]);
        char a = (ReadCsvDataSum.getDataSumArray()[19][1]).charAt(0);
        int b = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[19][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleByteInt() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[20][0]);
        byte a = Byte.parseByte(ReadCsvDataSum.getDataSumArray()[20][1]);
        int b = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[20][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleLongInt() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[21][0]);
        long a = Long.parseLong(ReadCsvDataSum.getDataSumArray()[21][1]);
        int b = Integer.parseInt(ReadCsvDataSum.getDataSumArray()[21][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleDoubleFloat() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[22][0]);
        double a = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[22][1]);
        float b = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[22][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleDoubleString() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[23][0]);
        double a = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[23][1]);
        String b = ReadCsvDataSum.getDataSumArray()[23][2];
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleDoubleShort() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[24][0]);
        double a = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[24][1]);
        short b = Short.parseShort(ReadCsvDataSum.getDataSumArray()[24][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleDoubleChar() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[25][0]);
        double a = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[25][1]);
        char b = (ReadCsvDataSum.getDataSumArray()[25][2]).charAt(0);

        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleDoubleByte() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[26][0]);
        double a = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[26][1]);
        byte b = Byte.parseByte(ReadCsvDataSum.getDataSumArray()[26][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleDoubleLong() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[27][0]);
        double a = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[27][1]);
        long b = Long.parseLong(ReadCsvDataSum.getDataSumArray()[27][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleLongDouble() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[28][0]);
        long a = Long.parseLong(ReadCsvDataSum.getDataSumArray()[28][1]);
        double b = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[28][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleFloatDouble() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[29][0]);
        float a = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[29][1]);
        double b = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[29][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleStringDouble() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[30][0]);
        String a = ReadCsvDataSum.getDataSumArray()[30][1];
        double b = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[30][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleShortDouble() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[31][0]);
        short a = Short.parseShort(ReadCsvDataSum.getDataSumArray()[31][1]);
        double b = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[31][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleCharDouble() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[32][0]);
        char a = (ReadCsvDataSum.getDataSumArray()[32][1]).charAt(0);
        double b = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[32][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleByteDouble() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[33][0]);
        byte a = Byte.parseByte(ReadCsvDataSum.getDataSumArray()[33][1]);
        double b = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[33][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleFloatString() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[34][0]);
        float a = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[34][1]);
        String b = ReadCsvDataSum.getDataSumArray()[34][2];
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleFloatShort() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[35][0]);
        float a = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[35][1]);
        short b = Short.parseShort(ReadCsvDataSum.getDataSumArray()[35][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleFloatChar() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[36][0]);
        float a = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[36][1]);
        char b = (ReadCsvDataSum.getDataSumArray()[36][2]).charAt(0);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleFloatByte() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[37][0]);
        short a = Short.parseShort(ReadCsvDataSum.getDataSumArray()[37][1]);
        double b = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[37][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleFloatLong() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[38][0]);
        float a = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[38][1]);
        long b = Long.parseLong(ReadCsvDataSum.getDataSumArray()[38][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleLongFloat() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[39][0]);
        long a = Long.parseLong(ReadCsvDataSum.getDataSumArray()[39][1]);
        float b = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[39][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleStringFloat() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[40][0]);
        String a = ReadCsvDataSum.getDataSumArray()[40][1];
        float b = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[40][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleShortFloat() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[41][0]);
        short a = Short.parseShort(ReadCsvDataSum.getDataSumArray()[41][1]);
        float b = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[41][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleCharFloat() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[42][0]);
        char a = (ReadCsvDataSum.getDataSumArray()[42][1]).charAt(0);
        float b = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[42][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleByteFloat() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[43][0]);
        byte a = Byte.parseByte(ReadCsvDataSum.getDataSumArray()[43][1]);
        float b = Float.parseFloat(ReadCsvDataSum.getDataSumArray()[43][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleStringShort() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[44][0]);
        String a = ReadCsvDataSum.getDataSumArray()[44][1];
        short b = Short.parseShort(ReadCsvDataSum.getDataSumArray()[44][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleStringChar() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[45][0]);
        String a = ReadCsvDataSum.getDataSumArray()[45][1];
        char b = (ReadCsvDataSum.getDataSumArray()[45][2]).charAt(0);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleStringByte() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[46][0]);
        String a = ReadCsvDataSum.getDataSumArray()[46][1];
        byte b = Byte.parseByte(ReadCsvDataSum.getDataSumArray()[46][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleStringLong() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[47][0]);
        String a = ReadCsvDataSum.getDataSumArray()[47][1];
        long b = Long.parseLong(ReadCsvDataSum.getDataSumArray()[47][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleLongString() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[48][0]);
        long a = Long.parseLong(ReadCsvDataSum.getDataSumArray()[48][1]);
        String b = ReadCsvDataSum.getDataSumArray()[48][2];
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleShortString() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[49][0]);
        short a = Short.parseShort(ReadCsvDataSum.getDataSumArray()[49][1]);
        String b = ReadCsvDataSum.getDataSumArray()[49][2];
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleCharString() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[50][0]);
        char a = (ReadCsvDataSum.getDataSumArray()[50][1]).charAt(0);
        String b = ReadCsvDataSum.getDataSumArray()[50][2];
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleByteString() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[51][0]);
        byte a = Byte.parseByte(ReadCsvDataSum.getDataSumArray()[51][1]);
        String b = ReadCsvDataSum.getDataSumArray()[51][2];
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleShortChar() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[52][0]);
        short a = Short.parseShort(ReadCsvDataSum.getDataSumArray()[52][1]);
        char b = (ReadCsvDataSum.getDataSumArray()[52][2]).charAt(0);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleShortByte() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[53][0]);
        short a = Short.parseShort(ReadCsvDataSum.getDataSumArray()[53][1]);
        byte b = Byte.parseByte(ReadCsvDataSum.getDataSumArray()[53][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleShortLong() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[54][0]);
        short a = Short.parseShort(ReadCsvDataSum.getDataSumArray()[54][1]);
        long b = Long.parseLong(ReadCsvDataSum.getDataSumArray()[54][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleLongShort() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[55][0]);
        long a = Long.parseLong(ReadCsvDataSum.getDataSumArray()[55][1]);
        short b = Short.parseShort(ReadCsvDataSum.getDataSumArray()[55][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleCharShort() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[56][0]);
        char a = (ReadCsvDataSum.getDataSumArray()[56][1]).charAt(0);
        short b = Short.parseShort(ReadCsvDataSum.getDataSumArray()[56][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleByteShort() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[57][0]);
        byte a = Byte.parseByte(ReadCsvDataSum.getDataSumArray()[57][1]);
        short b = Short.parseShort(ReadCsvDataSum.getDataSumArray()[57][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleCharByte() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[58][0]);
        char a = (ReadCsvDataSum.getDataSumArray()[58][1]).charAt(0);
        byte b = Byte.parseByte(ReadCsvDataSum.getDataSumArray()[58][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleCharLong() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[59][0]);
        char a = (ReadCsvDataSum.getDataSumArray()[59][1]).charAt(0);
        long b = Long.parseLong(ReadCsvDataSum.getDataSumArray()[59][2]);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleLongChar() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[60][0]);
        long a = Long.parseLong(ReadCsvDataSum.getDataSumArray()[60][1]);
        char b = (ReadCsvDataSum.getDataSumArray()[60][2]).charAt(0);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }

    @Test
    public void testSumDoubleByteChar() {
        double expected = Double.parseDouble(ReadCsvDataSum.getDataSumArray()[61][0]);
        byte a = Byte.parseByte(ReadCsvDataSum.getDataSumArray()[61][1]);
        char b = (ReadCsvDataSum.getDataSumArray()[61][2]).charAt(0);
        assertEquals(expected, calculator.sum(a, b), 1e-15);
    }


    @AfterTest
    public void endTest() {
        calculator = null;
    }
}
