package TddFibonacci.nameInverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {
    NameInverter nameInverter;

    @BeforeEach
    public void setup(){
        nameInverter = new NameInverter();
    }
    @Test
    public void nothing() {

    }
    //input String -"" , output String -"";
    @Test
    public void giveEmpty_returnEmpty() {
        String invertedName = nameInverter.inverterName("");
        assertEquals("",invertedName);
    }
    //input "name" , output "name"

    @Test
    public void givenSingleWord_returnSingleWord(){
        String invertedName = nameInverter.inverterName("name");
        assertEquals("name",invertedName);
    }
    @Test
    public void givenSingleWordWithTrailingSpaces_returnSingleWord(){
        String invertedName = nameInverter.inverterName("name  ");
        assertEquals("name",invertedName);
    }

    @Test
    public void givenSingleWordWithBeggingSpaces_returnSingleWord(){
        String invertedName = nameInverter.inverterName("  name  ");
        assertEquals("name",invertedName);
    }
    @Test
    public void givenFirstLast_returnInvertedName(){
        String invertedName = nameInverter.inverterName("first last");
        assertEquals("last, first",invertedName);
    }
    @Test
    public void givenHonorifics_ignoreHonorifics(){
        String invertedName = nameInverter.inverterName("Mrs. first last");
        assertEquals("last, first",invertedName);
    }

    @Test
    public void givenMrHonorifics_ignoreHonorifics(){
        String invertedName = nameInverter.inverterName("Mr. first last");
        assertEquals("last, first",invertedName);
    }
    @Test
    public void givenPostNominals_stayAtEnd() {
        String invertedName = nameInverter.inverterName("first last MSc.");
        assertEquals("last, first MSc.",invertedName);
    }

    @Test
    public void givenMultiPostNominals_stayAtEnd() {
        String invertedName = nameInverter.inverterName("first last MSc. PhD.");
        assertEquals("last, first MSc. PhD.",invertedName);
    }
    @Test
    public void integrationTest() {
        String invertedName = nameInverter.inverterName("Mr. Bob Martins MTech. PhD.");
        assertEquals("Martins, Bob MTech. PhD.",invertedName);
    }

}
