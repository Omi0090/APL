import java.util.*;

class Product
{
	int id;
	String name;
	double price;
	int qty;
	Product(int i,String n,double p,int q)
	{
		id=i;
		name=n;
		price=p;
		qty=q;
	}
	public String toString()
	{
		return ("\nName: "+name+"\nID: "+id+"\nPrice: "+price+"\nQuantity: "+qty);
	}
}

class Cart
{
	Vector<Product> v=new Vector<Product>();
	public void addItem()
	{
		Scanner obj=new Scanner(System.in);
		int id,qty;
		String name;
		double price;
		System.out.println("Enter Id:");
		id=obj.nextInt();
		obj.nextLine();
		System.out.println("Enter Name:");
		name=obj.nextLine();
		System.out.println("Enter Price:");
		price=obj.nextDouble();
	    System.out.println("Enter Quantity:");
		qty=obj.nextInt();
		Product p=new Product(id,name,price,qty);
		v.add(p);
	}
	public void deleteItem(int id)
	{
		for(int i=0;i<v.size();i++)
		{
			if(v.get(i).id==id)
			{
				v.remove(i);
				break;
			}
		}
	}
	public String toString()
	{
		return v.toString();
	}
	public void checkOut()
	{
		v.sort(Comparator.comparingDouble(p->p.price));
		double count=0;
		for(Product p:v)
		{
			System.out.println(p);
			count=count+(p.price*p.qty);
		}
		System.out.println("\nTotal Price: "+count);
	}
}

class Vectorq
{
	public static void main(String args[])
	{	
		Scanner obj=new Scanner(System.in);
		Cart c=new Cart();
		int ch,id;
		System.out.println("1.Add to Cart");
		System.out.println("2.Delete from Cart");
		System.out.println("3.Check out");
		System.out.println("4.Exit the program");
		
		do
		{
			System.out.println("\nEnter Your Choice:");
			ch=obj.nextInt();
			switch(ch)
			{
				case 1:
				   c.addItem();
				   break;
				case 2:
					System.out.println("Enter Id of product to be deleted:");
					id=obj.nextInt();
					c.deleteItem(id);
					break;
				case 3:
					c.checkOut();
					break;
				case 4:
					System.out.println("Exit the Program");
					break;
					
			}
		}while(ch!=4);
	}
}