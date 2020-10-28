package tests.testSubtraction;

import dzmitry.klokau.testing.Calculator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class TestSub {
    private Calculator calculator;

    @BeforeTest
    public void setUp() throws IOException {
        calculator = new Calculator();
        ReadCsvDataSub.readSumData();
    }

    @Test
    public void testSubIntIntInt() {
        int expected = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[0][0]);
        int a = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[0][1]);
        int b = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[0][2]);
        assertEquals(expected, calculator.subtraction(a, b));
    }

    @Test
    public void testSubIntDoubleDouble() {
        int expected = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[1][0]);
        double a = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[1][1]);
        double b = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[1][2]);
        assertEquals(expected, calculator.subtraction(a, b));
    }

    @Test
    public void testSubFloatFloatFloat() {
        float expected = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[2][0]);
        float a = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[2][1]);
        float b = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[2][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubFloatStringString() {
        float expected = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[3][0]);
        String a = ReadCsvDataSub.getDataSubArray()[3][1];
        String b = ReadCsvDataSub.getDataSubArray()[3][2];
        assertEquals(expected, calculator.subtraction(a, b), 1e-1);
    }

    @Test
    public void testSubIntShortShort() {
        int expected = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[4][0]);
        short a = Short.parseShort(ReadCsvDataSub.getDataSubArray()[4][1]);
        short b = Short.parseShort(ReadCsvDataSub.getDataSubArray()[4][2]);
        assertEquals(expected, calculator.subtraction(a, b));
    }

    @Test
    public void testSubIntCharChar() {
        int expected = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[5][0]);
        char a = (ReadCsvDataSub.getDataSubArray()[5][1]).charAt(0);
        char b = (ReadCsvDataSub.getDataSubArray()[5][2]).charAt(0);
        assertEquals(expected, calculator.subtraction(a, b));
    }

    @Test
    public void testSubIntByteByte() {
        int expected = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[6][0]);
        byte a = Byte.parseByte(ReadCsvDataSub.getDataSubArray()[6][1]);
        byte b = Byte.parseByte(ReadCsvDataSub.getDataSubArray()[6][2]);
        assertEquals(expected, calculator.subtraction(a, b));
    }

    @Test
    public void testSubLongLongLong() {
        long expected = Long.parseLong(ReadCsvDataSub.getDataSubArray()[7][0]);
        long a = Long.parseLong(ReadCsvDataSub.getDataSubArray()[7][1]);
        long b = Long.parseLong(ReadCsvDataSub.getDataSubArray()[7][2]);
        assertEquals(expected, calculator.subtraction(a, b));
    }

    @Test
    public void testSubDoubleIntDouble() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[8][0]);
        int a = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[8][1]);
        double b = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[8][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleIntFloat() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[9][0]);
        int a = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[9][1]);
        float b = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[9][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleIntString() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[10][0]);
        int a = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[10][1]);
        String b = ReadCsvDataSub.getDataSubArray()[10][2];
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleIntShort() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[11][0]);
        int a = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[11][1]);
        short b = Short.parseShort(ReadCsvDataSub.getDataSubArray()[11][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleIntChar() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[12][0]);
        int a = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[12][1]);
        char b = (ReadCsvDataSub.getDataSubArray()[12][2]).charAt(0);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleIntByte() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[13][0]);
        int a = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[13][1]);
        byte b = Byte.parseByte(ReadCsvDataSub.getDataSubArray()[13][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleIntLong() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[14][0]);
        int a = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[14][1]);
        long b = Long.parseLong(ReadCsvDataSub.getDataSubArray()[14][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleDoubleInt() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[15][0]);
        double a = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[15][1]);
        int b = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[15][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleFloatInt() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[16][0]);
        float a = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[16][1]);
        int b = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[16][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleStringInt() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[17][0]);
        String a = ReadCsvDataSub.getDataSubArray()[17][1];
        int b = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[17][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleShortInt() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[18][0]);
        short a = Short.parseShort(ReadCsvDataSub.getDataSubArray()[18][1]);
        int b = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[18][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleCharInt() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[19][0]);
        char a = (ReadCsvDataSub.getDataSubArray()[19][1]).charAt(0);
        int b = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[19][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleByteInt() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[20][0]);
        byte a = Byte.parseByte(ReadCsvDataSub.getDataSubArray()[20][1]);
        int b = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[20][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleLongInt() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[21][0]);
        long a = Long.parseLong(ReadCsvDataSub.getDataSubArray()[21][1]);
        int b = Integer.parseInt(ReadCsvDataSub.getDataSubArray()[21][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleDoubleFloat() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[22][0]);
        double a = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[22][1]);
        float b = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[22][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleDoubleString() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[23][0]);
        double a = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[23][1]);
        String b = ReadCsvDataSub.getDataSubArray()[23][2];
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleDoubleShort() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[24][0]);
        double a = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[24][1]);
        short b = Short.parseShort(ReadCsvDataSub.getDataSubArray()[24][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleDoubleChar() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[25][0]);
        double a = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[25][1]);
        char b = (ReadCsvDataSub.getDataSubArray()[25][2]).charAt(0);

        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleDoubleByte() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[26][0]);
        double a = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[26][1]);
        byte b = Byte.parseByte(ReadCsvDataSub.getDataSubArray()[26][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleDoubleLong() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[27][0]);
        double a = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[27][1]);
        long b = Long.parseLong(ReadCsvDataSub.getDataSubArray()[27][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleLongDouble() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[28][0]);
        long a = Long.parseLong(ReadCsvDataSub.getDataSubArray()[28][1]);
        double b = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[28][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleFloatDouble() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[29][0]);
        float a = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[29][1]);
        double b = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[29][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleStringDouble() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[30][0]);
        String a = ReadCsvDataSub.getDataSubArray()[30][1];
        double b = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[30][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleShortDouble() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[31][0]);
        short a = Short.parseShort(ReadCsvDataSub.getDataSubArray()[31][1]);
        double b = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[31][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleCharDouble() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[32][0]);
        char a = (ReadCsvDataSub.getDataSubArray()[32][1]).charAt(0);
        double b = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[32][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleByteDouble() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[33][0]);
        byte a = Byte.parseByte(ReadCsvDataSub.getDataSubArray()[33][1]);
        double b = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[33][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleFloatString() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[34][0]);
        float a = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[34][1]);
        String b = ReadCsvDataSub.getDataSubArray()[34][2];
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleFloatShort() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[35][0]);
        float a = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[35][1]);
        short b = Short.parseShort(ReadCsvDataSub.getDataSubArray()[35][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleFloatChar() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[36][0]);
        float a = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[36][1]);
        char b = (ReadCsvDataSub.getDataSubArray()[36][2]).charAt(0);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleFloatByte() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[37][0]);
        short a = Short.parseShort(ReadCsvDataSub.getDataSubArray()[37][1]);
        double b = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[37][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleFloatLong() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[38][0]);
        float a = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[38][1]);
        long b = Long.parseLong(ReadCsvDataSub.getDataSubArray()[38][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleLongFloat() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[39][0]);
        long a = Long.parseLong(ReadCsvDataSub.getDataSubArray()[39][1]);
        float b = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[39][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleStringFloat() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[40][0]);
        String a = ReadCsvDataSub.getDataSubArray()[40][1];
        float b = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[40][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleShortFloat() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[41][0]);
        short a = Short.parseShort(ReadCsvDataSub.getDataSubArray()[41][1]);
        float b = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[41][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleCharFloat() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[42][0]);
        char a = (ReadCsvDataSub.getDataSubArray()[42][1]).charAt(0);
        float b = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[42][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleByteFloat() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[43][0]);
        byte a = Byte.parseByte(ReadCsvDataSub.getDataSubArray()[43][1]);
        float b = Float.parseFloat(ReadCsvDataSub.getDataSubArray()[43][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleStringShort() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[44][0]);
        String a = ReadCsvDataSub.getDataSubArray()[44][1];
        short b = Short.parseShort(ReadCsvDataSub.getDataSubArray()[44][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleStringChar() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[45][0]);
        String a = ReadCsvDataSub.getDataSubArray()[45][1];
        char b = (ReadCsvDataSub.getDataSubArray()[45][2]).charAt(0);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleStringByte() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[46][0]);
        String a = ReadCsvDataSub.getDataSubArray()[46][1];
        byte b = Byte.parseByte(ReadCsvDataSub.getDataSubArray()[46][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleStringLong() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[47][0]);
        String a = ReadCsvDataSub.getDataSubArray()[47][1];
        long b = Long.parseLong(ReadCsvDataSub.getDataSubArray()[47][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleLongString() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[48][0]);
        long a = Long.parseLong(ReadCsvDataSub.getDataSubArray()[48][1]);
        String b = ReadCsvDataSub.getDataSubArray()[48][2];
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleShortString() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[49][0]);
        short a = Short.parseShort(ReadCsvDataSub.getDataSubArray()[49][1]);
        String b = ReadCsvDataSub.getDataSubArray()[49][2];
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleCharString() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[50][0]);
        char a = (ReadCsvDataSub.getDataSubArray()[50][1]).charAt(0);
        String b = ReadCsvDataSub.getDataSubArray()[50][2];
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleByteString() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[51][0]);
        byte a = Byte.parseByte(ReadCsvDataSub.getDataSubArray()[51][1]);
        String b = ReadCsvDataSub.getDataSubArray()[51][2];
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleShortChar() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[52][0]);
        short a = Short.parseShort(ReadCsvDataSub.getDataSubArray()[52][1]);
        char b = (ReadCsvDataSub.getDataSubArray()[52][2]).charAt(0);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleShortByte() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[53][0]);
        short a = Short.parseShort(ReadCsvDataSub.getDataSubArray()[53][1]);
        byte b = Byte.parseByte(ReadCsvDataSub.getDataSubArray()[53][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleShortLong() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[54][0]);
        short a = Short.parseShort(ReadCsvDataSub.getDataSubArray()[54][1]);
        long b = Long.parseLong(ReadCsvDataSub.getDataSubArray()[54][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleLongShort() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[55][0]);
        long a = Long.parseLong(ReadCsvDataSub.getDataSubArray()[55][1]);
        short b = Short.parseShort(ReadCsvDataSub.getDataSubArray()[55][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleCharShort() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[56][0]);
        char a = (ReadCsvDataSub.getDataSubArray()[56][1]).charAt(0);
        short b = Short.parseShort(ReadCsvDataSub.getDataSubArray()[56][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleByteShort() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[57][0]);
        byte a = Byte.parseByte(ReadCsvDataSub.getDataSubArray()[57][1]);
        short b = Short.parseShort(ReadCsvDataSub.getDataSubArray()[57][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleCharByte() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[58][0]);
        char a = (ReadCsvDataSub.getDataSubArray()[58][1]).charAt(0);
        byte b = Byte.parseByte(ReadCsvDataSub.getDataSubArray()[58][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleCharLong() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[59][0]);
        char a = (ReadCsvDataSub.getDataSubArray()[59][1]).charAt(0);
        long b = Long.parseLong(ReadCsvDataSub.getDataSubArray()[59][2]);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleLongChar() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[60][0]);
        long a = Long.parseLong(ReadCsvDataSub.getDataSubArray()[60][1]);
        char b = (ReadCsvDataSub.getDataSubArray()[60][2]).charAt(0);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @Test
    public void testSubDoubleByteChar() {
        double expected = Double.parseDouble(ReadCsvDataSub.getDataSubArray()[61][0]);
        byte a = Byte.parseByte(ReadCsvDataSub.getDataSubArray()[61][1]);
        char b = (ReadCsvDataSub.getDataSubArray()[61][2]).charAt(0);
        assertEquals(expected, calculator.subtraction(a, b), 1e-15);
    }

    @AfterTest
    public void endTest() {
        calculator = null;
    }
}
