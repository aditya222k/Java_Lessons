import static org.junit.jupiter.api.Assertions.*;

class HashMapPlaygroundTest {
    int x=2;
    int y=2;
    int z=3;

    @org.junit.jupiter.api.Test
    public void test1() throws InterruptedException {
        assertTrue(2==2);
    }
    @org.junit.jupiter.api.Test
    public void test2(){
        assertFalse(1==2);
    }


    @org.junit.jupiter.api.Test
    public void ass1(){
        assertEquals(x,y);
    }
    @org.junit.jupiter.api.Test
    public void ass2(){
        assertNotEquals(y,z);
    }
}