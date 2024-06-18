package generic.com;


class Data{
	private Object obj;

	public Data(Object obj) {
		super();
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
}
class GenericClass<T>{
	private T data;

	public GenericClass(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	
	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
} 
public class App {
	
	public static void main(String[] args) {
//	Data data=new Data("Some Data");
//		String element=(String) data.getObj();
//		System.out.println(element);
		
		GenericClass<String> gc=new GenericClass<String>("Some generic data");
		String data1=gc.getData();
		System.out.println(data1);
		
	}

}
