import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {
    @Test
    public void  testThatParseMethodIsWorking() {
        HugeInteger integer = new HugeInteger();

        integer.parse("123");
    }

    @Test
    public void testThatTwoHugeIntegersCanBeAdded() {
        HugeInteger first = new HugeInteger("123");
        HugeInteger second = new HugeInteger("456");

        HugeInteger result = first.add(second);

        assertEquals("579", result.toString());
    }

    @Test
    public void testThatAdditionHandlesCarry() {
        HugeInteger first = new HugeInteger("128");
        HugeInteger second = new HugeInteger("457");

        HugeInteger result = first.add(second);

        assertEquals("585", result.toString());
    }

    @Test
    public void testThatSubtractionCanBedone(){
        HugeInteger first = new HugeInteger("128");
        HugeInteger second = new HugeInteger("457");

        HugeInteger result = second.subtract(first);

        assertEquals("329", result.toString());
    }

    @Test
    public void testThatSubtractionofNegativeNumberCanBedone(){
        HugeInteger first = new HugeInteger("128");
        HugeInteger second = new HugeInteger("457");

        HugeInteger result = first.subtract(second);

        assertEquals("-329", result.toString());
    }

}

