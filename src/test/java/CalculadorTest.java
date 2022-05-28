import org.junit.*;

public class CalculadorTest {

    public static final double DELTA = 0.001;
    private Calculador calculador;

    @BeforeClass public static void beforeClass() {
        System.out.println("Operación iniciada");
        //TODO Leer before()
        //calculador = new Calculador();
    }

    @Before
    public void before() {
        //TODO Debería ir en @BeforeClass según el profe, pero pide que sea static CalculadorTest o Calculador
        // pero si hacemos Calculador static, no tiene sentido instanciarlo.
        calculador = new Calculador();

        //TODO ¿ESTO VA EN @Before? PORQUE SIEMPRE IMPRIME "before". Funciona si se pone en cada test.
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void testSuma() {
        //System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        int a = 15; int b = 20;
        int expectedResult = 35;
        double result = calculador.sumar(a, b);
        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void testResta() {
        int a = 25; int b = 20;
        int expectedResult = 5;
        double result = calculador.restar(a, b);
        Assert.assertEquals(expectedResult, result, DELTA);
    }

    @Test
    public void testMultiplicion() {
        int a = 10; int b = 25;
        long expectedResult = 250;
        long result = calculador.multiplicar(a, b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivision() {
        int a = 56; int b = 10;
        int expectedResult = 5;
        int result = calculador.dividir(a, b);
        Assert.assertEquals(expectedResult, result);
    }

    @After
    public void after() {
        //TODO ¿Qué campos? :s
        System.out.println("Prueba finalizada, campos en 0");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("la operación ha finalizado");
    }
}
