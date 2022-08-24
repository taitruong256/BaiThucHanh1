package Bai2;

public class testToaDo2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToaDo2D oxyz = new ToaDo2D("A", 1, 2, 3);
		System.out.println("Diem doi qua goc toa do: "+oxyz.negate().toString());
		System.out.println("Khoach cach tu 0 den "+oxyz.getTen()+" la: "+oxyz.getDistance());
	}

}
