package app;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.LineString;

public class LineStringIntersect {

	static Geometry linxyz;

	static Coordinate[] coordinateArrayXyz = new Coordinate[2];

	static Coordinate[] coordinateArrayX = { new Coordinate(18.852589910110368, -10.12538983836933), new Coordinate(15.105187008584947, -13.34232717578331) };

	static Coordinate[] coordinateArrayA = { new Coordinate(12.0, 2.0), new Coordinate(12.0, 13.0), new Coordinate(12.0, 19.0)
	};

	static Coordinate[] coordinateArrayB = { new Coordinate(2.0, 10.0), new Coordinate(10.0, 10.0), new Coordinate(21.0, 11.0)
	};

	static Coordinate[] coordinateArrayC = { new Coordinate(1.0, 1.0), new Coordinate(9.0, 9.0), new Coordinate(20.0, 20.0)
	};

	static GeometryFactory geometryFactory = new GeometryFactory();

	static LineString lineStringX = geometryFactory
			.createLineString(coordinateArrayX);

	static LineString lineStringA = geometryFactory
			.createLineString(coordinateArrayA);
	static LineString lineStringB = geometryFactory
			.createLineString(coordinateArrayB);
	static LineString lineStringC = geometryFactory
			.createLineString(coordinateArrayC);

	static Geometry geometryAB = lineStringA.intersection(lineStringB);
	static Geometry geometryAC = lineStringA.intersection(lineStringC);
	static Geometry geometryBC = lineStringB.intersection(lineStringC);

	public static void main(String args[]) {
		coordinateArrayXyz[0] = new Coordinate(18.852589910110368, -10.12538983836933);
		coordinateArrayXyz[1] = new Coordinate(15.105187008584947, -13.34232717578331);
		LineString lineStringXYZ = geometryFactory.createLineString(coordinateArrayXyz);
		linxyz = lineStringXYZ;
		System.out.println("linxyz: " + linxyz);

		System.out.println("AB: " + geometryAB);
		System.out.println("AC: " + geometryAC);
		System.out.println("BC: " + geometryBC);
	}

}
