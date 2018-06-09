package test;
import java.util.Scanner;
import java.util.ArrayList;
public class  kucun
{	
	String pname;
	double size;
	double price;
	int inventory;
	public kucun(String cname,double csize,double cprice,int cinventory){
		pname = cname;
		size = csize;
		price = cprice;
		inventory = cinventory;
	}
	public static void Addinventory(ArrayList<kucun> product){
		Scanner n = new Scanner(System.in);
		System.out.println("请输入商品名称");
        String nname = n.next();
		System.out.println("请输入商品尺寸");
		double nsize = n.nextDouble();
		System.out.println("请输入商品价格");
		double nprice = n.nextDouble();
		System.out.println("请输入商品库存");
		int ninventory = n.nextInt();
		product.add(new kucun(nname,nsize,nprice,ninventory));
	}
	public static void Dropinventory(ArrayList<kucun> product){
		while(true){
			Scanner d = new Scanner(System.in);
			System.out.println("请输入要删除的商品编号");
			int id = d.nextInt()-1;
			if(id>=product.size()){
				System.out.println("没有该商品，请重新输入商品编号");
			}else{
				product.remove(id);
				return;
			}
		}
	}
	public static void CheckInventory(ArrayList<kucun> product){
			int tinventory = 0;
			double tprice = 0;
			System.out.println("------------------"+"商城库存清单"+"------------------");
			System.out.println("");
			System.out.println("商品编号"+'\t'+"品牌型号"+'\t'+'\t'+"尺寸"+'\t'+"价格"+'\t'+"库存数");
			for(int j=0;j<product.size();j++){
				System.out.println((j+1)+"  "+'\t'+product.get(j).pname+'\t'+product.get(j).size+'\t'+product.get(j).price+'\t'+product.get(j).inventory);
			}
			System.out.println("-----------------------------------------------");
			for(int i=0;i<product.size();i++){
				tinventory+=product.get(i).inventory;
				tprice+=product.get(i).price;
			}
			System.out.println("总库存数："+tinventory);
			System.out.println("库存商品总额："+tprice);
	}
	public static void ChangeInventory(ArrayList<kucun> product){
			while(true){
				System.out.println("请输入要修改的商品编号");
				Scanner c = new Scanner(System.in);
				int ci = c.nextInt()-1;
				System.out.println("请输入要修改的库存数量");
				int kc = c.nextInt();
				if(ci>=product.size()){
					System.out.println("没有该商品，请重新输入商品编号");
				}else{
					product.get(ci).inventory = kc;
					return;
				}
			}
	}

	public static void main(String[] args){	
		kucun mba = new kucun("MacBOOKAir",13.3,6988.88,5);
		kucun tp = new kucun("ThinkpadT450",14.0,5999.99,10);
		kucun asus = new kucun("ASUS-FL5800",15.6,4999.5,18);
		ArrayList<kucun> product = new ArrayList<kucun>();
		product.add(mba);
		product.add(tp);
		product.add(asus);
		Scanner se = new Scanner(System.in);
		while(true){
			System.out.println("-------库存管理-------");
			System.out.println("1.查看库存清单");
			System.out.println("2.修改库存数量");
            System.out.println("3.添加新库存");
			System.out.println("4.删除库存");
			System.out.println("5.退出");
			System.out.println("请输入要执行的操作序号：");
			int select = se.nextInt();
			switch(select){
				case 1:
					CheckInventory(product);
					break;
				case 2:
					ChangeInventory(product);
					break;
				case 3:
					Addinventory(product);
					break;
				case 4:
					Dropinventory(product);
					break;
				case 5:
					se.close();
					return;
				default:
					System.out.println("操作号输入错误，请重新输入：");	
			}
		}
		
	}
}
