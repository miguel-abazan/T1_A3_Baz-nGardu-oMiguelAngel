
class Operaciones {

	int prim[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
	int div[] = { 1, 2, 5, 7, 10, 14, 25, 35, 50, 70, 175, 350 };
	String a1;
	String b1;

	public void union() {
		int n = 0;
		String v = "";
		String b2 = "";

		for (int i = 1; i < div.length; i++) {
			b2 = b2 + div[i] + ",";
		}

		for (int i = 0; i < prim.length; i++) {
			for (int j = 0; j < div.length; j++) {
				if (prim[i] == div[j]) {

				} else {
					n = n + 1;
				}
			}
			if (n == div.length) {
				v = v + prim[i] + ",";
			}
			n = 0;
		}
		v = v + b2;
		System.out.println(v);

	}

	public void interseccion() {
		int u = 0;
		String v = "";

		for (int i = 1; i < prim.length; i++) {
			for (int j = 0; j < div.length; j++) {
				if (prim[i] == div[j]) {

				} else {
					u = u + 1;
				}
			}
			if (u < div.length) {
				v = v + prim[i] + ",";
			}
			u = 0;
		}

		System.out.println(v);

	}

	public void diferencia() {
		int u = 0;
		String v = "";

		for (int i = 0; i < prim.length; i++) {
			for (int j = 0; j < div.length; j++) {
				if (prim[i] == div[j]) {

				} else {
					u = u + 1;
				}
			}
			if (u == div.length) {
				v = v + prim[i] + ",";
			}
			u = 0;
		}
		System.out.println(v);
	}
}

public class PruebaTDA_Conjuntos {

	public static void main(String[] args) {

		Operaciones op = new Operaciones();
		
		System.out.print("Union: ");
		op.union();
		System.out.print("Interseccion: ");
		op.interseccion();
		System.out.print("Diferencia: ");
		op.diferencia();

	}

}