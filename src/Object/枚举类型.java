package Object;

public class ö������ {
//ö��enum��һ���������(������)��ʹ��ö�ٿ��Ժܷ���Ķ��峣��
//	�������һ��ö������ ���ڣ�������4�ֳ���
//ʹ��ö�٣����ܰѷ�Χ�������޶������ĸ����У����Բ���default
	public enum Season {
	SPRING,SUMMER,AUTUMN,WINTER
}
	public enum Hero {
		TANK,WIZARD,ASSASSIN,ASSIST,WARRIOR,RANGED,PUSH,FARMING;
	}
/*һ�����õĳ��Ͼ���switch����У�ʹ��ö���������ж�
ע����Ϊ�ǳ���������һ�㶼��ȫ��д*/
	public static void main(String[] args) {
		Season season = Season.SPRING;
        switch (season) {
        case SPRING:
            System.out.println("����");
            break;
        case SUMMER:
            System.out.println("����");
            break;
        case AUTUMN:
            System.out.println("����");
            break;
        case WINTER:
            System.out.println("����");
            break;
        }
        Hero hero = Hero.TANK;
        switch(hero) {
        case TANK:
        	System.out.println("̹��");
        	break;
        case WIZARD:
        	System.out.println("��ʦ");
        	break;
        case ASSASSIN:
        	System.out.println("�̿�");
        	break;
        case ASSIST:
        	System.out.println("����");
        	break;
        case WARRIOR:
        	System.out.println("��ս");
        	break;
        case RANGED:
        	System.out.println("Զ��");
        	break;
        case PUSH:
        	System.out.println("�ƽ�");
        	break;
        case FARMING:
        	System.out.println("��Ұ");
        	break;
        }
	}

}
