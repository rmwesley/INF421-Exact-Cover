//import java.awt.Point;
import java.awt.Dimension;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) throws Exception {

		//Test.minimalPolygon();
		//Test.inf421printer();
		//Test.numberOfFreePolyominosNaive(3);
		//Test.numberOfFixedPolyominosNaive(3);
		//Test.freeGenerator(6);
		//Test.fixedGenerator(4);
		//Test.ECPolyominoExample();
		//Test.ECPolyominoExample2();
		//Test.GenericECExample();
		//Test.ExactcoverExample();
		//Test.DancingLinks();
		//Test.DancingLinksImage();
		//Test.countDilateFixed(4, 3);
		//Test.countDilateFree(4, 3);

		Test.dilateRepresentFixed(4, 3);
		Test.dilateRepresentFree(4, 3);
	}
}

