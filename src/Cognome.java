
public class creazionec {
	public static void main(String[] args) {
		
		metodi cerchio = new metodi(5.0);
		metodi cerchioc = new metodi(cerchio);
		System.out.println("diametro:" +cerchio.diametro());
		System.out.println("circonferenza:" +cerchio.perif());
		System.out.println("area:" +cerchio.area());
	}
}

public class metodi {
	double r;
	double c;
	public metodi(double r) {
		this.r = r;
	}
	public double diametro() {
		double diametro=r*2;
		return diametro;
	}
	public double perif() {
		double perif=r*2*3.14;
			return perif;
	}
	public double area() {
		double quadre=r*r;
		double area = quadre*3.14;
		return area;
	}
	public metodi(metodi c) {
		this.r = c.getRaggio()*2;
	}
	public double getRaggio() {
	return r;
	}
	@Override
	public String toString() {
		return "metodi [getRaggio()=" + getRaggio() + "]";
	}
	}



package altronome;
import java.util.Scanner;
public class quattrodue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserire il primo raggio");
		int ru= scan.nextInt();
		System.out.println("inserire il secondo raggio");
		int rd= scan.nextInt();
		quattro c1 = new quattro (ru);
		quattro c2 = new quattro (rd);
		System.out.println("dimetro primo cerchio :"+c1.diametro());
		System.out.println("perimetro primo cerchio : "+c1.perimetro());
		System.out.println("area primo cerchio : "+c1.area());
		System.out.println("dimetro secondo cerchio :"+c2.diametro());
		System.out.println("perimetro secondo cerchio : "+c2.perimetro());
		System.out.println("area primo secondo : "+c2.area());
	}

}


