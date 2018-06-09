package Object;

public class AHero {
//使用有参创建对象
	String name; //姓名
    float hp; //血量  
    float armor; //护甲  
    int moveSpeed; //移动速度
	public  AHero (String heroName, float heroHP, float heroArmor, int heroMoveSpeed ){
		name = heroName;
		hp = heroHP;
		armor = heroArmor;
		moveSpeed = heroMoveSpeed;
	}
	
	//基本类型传参 
	//在方法内，无法修改方法外的基本类型参数
	 //回血
    public void huixue(int xp){
        hp = hp + xp;
        //回血完毕后，血瓶=0
        xp=0;
    }
      
    public AHero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
    //类类传参
    // 攻击一个英雄，并让他掉damage点血
    public void attack(AHero hero, int damage) {
        hero.hp = hero.hp - damage;
    }
    
    /*如果一个变量是基本类型
	比如 int hp = 50;
	我们就直接管hp叫变量
	=表示赋值的意思。
	如果一个变量是类类型
	比如 Hero h = new Hero();
	我们就管h叫做引用。
	=不再是赋值的意思
	=表示指向的意思
	比如 Hero h = new Hero();
	这句话的意思是
	引用h，指向一个Hero对象*/
  //复活
    public void revive(AHero h){
        h = new AHero("提莫",383);
    }
	public static void main(String[] args) {
		AHero garen = new AHero("盖伦", 400 , 50 , 4);
		AHero ace = new AHero("艾希", 230 , 20 , 8);
		
		AHero teemo =  new AHero("提莫",383);
	         
			//血瓶，其值是50
			int xueping = 50;
		
			//提莫通过这个血瓶回血,血瓶50的数值传给huixue的参数xp
			//hp= hp+50=433
		
			//teemo.huixue(xueping);
	        System.out.println(teemo.hp);
	       // garen.attack(teemo, 100);
	        //System.out.println(teemo.hp);
	        teemo.hp = teemo.hp - 400;
	        teemo.revive(teemo);
	        System.out.println(teemo.hp);
	        //血量依旧是负数，revive方法的teemo指向的是一个新的temmo,所以不会改变原来的被扣血teemo
	}

}
