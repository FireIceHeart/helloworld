package �������;

public class ������� {

	public static void main(String[] args) {
		//if else
		boolean a = false;
		if (a) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		//����ж�����ʽ�������ô�������������
        if(a){
            System.out.println("yes1");
            System.out.println("yes2");
            System.out.println("yes3");
        }
         
        //������ʽ2 3 ����b�Ƿ�Ϊtrue����ִ��
         
        if(a)
            System.out.println("yes1");
            System.out.println("yes2");
            System.out.println("yes3");
       //else if �Ƕ������ж�
          //���ֻʹ�� if,��ִ��4���ж�
            int i = 2;
            if (i==1)
                System.out.println(1);
            if (i==2)
                System.out.println(2);
            if (i==3)
                System.out.println(3);
            if (i==4)
                System.out.println(4);
             
            //���ʹ��else if, һ����42�У��жϳ����� 44�к�46�е��жϾͲ���ִ���ˣ���Լ��������Դ
            if (i==1)
                System.out.println(1);
            else if (i==2)
                System.out.println(2);
            else if (i==3)
                System.out.println(3);
            else if (i==4)
                System.out.println(4);
            //switch���
            /*switch����ʹ��byte,short,int,char,String,enum
			ע: ÿ�����ʽ��������Ӧ����һ��break;
			ע: String��Java1.7֮ǰ�ǲ�֧�ֵ�, Java��1.7��ʼ֧��switch��String�ģ�������ǰ�Stringת��Ϊhashֵ����ʵ��������
			ע: enum��ö�����ͣ���ö���½�����ϸ����*/
            int day = 5;
            switch(day){
            case 1:
                System.out.println("����һ");
                break;
            case 2:
                System.out.println("���ڶ�");
                break;
            case 3:
                System.out.println("������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("������");
                break;
            case 6:
                System.out.println("������");
                break;
            case 7:
                System.out.println("������");
                break;
            default:
                System.out.println("�����ʲô��");
            }
            /*����ʹ���caseִֻ��һ�����ʽ ���� 
            case 1:
            case 2:
            case 3:
            	System.out.println("yes");
            	break;
            */
            //while��䣬ֻҪ���������᲻��ѭ��ִ��
            int A = 2;
            while(A<5){
            	System.out.println(A);
            	A++;
            }
            //��while�������ǣ������Ƿ��������ִ��һ�Σ��ٽ����ж�
            int B = 1;
            do{
            	System.out.println(B);
            	B++;
            }
            while(B<5);
            //for
            //������������ʽ1��2��3��1δ���ó�ʼֵ��2Ϊ���÷�Χ��3Ϊ�������Լ���ִ��˳��Ϊ��
            //��ִ��1��Ȼ���ж�2����Ϊ�棬ִ�д���������䣬����Ϊ�٣�ѭ��������Ȼ��ִ��3
            for (int j=0; j<5; j++){
            	System.out.println("for�����" + j);
            }
            //foreach��䣬��Ҫ���ڱ�������
            //for(ѭ������x : ��������obj){������x�����}
            int arr[] = {5,9,12};
            for (int x : arr){
            	System.out.println(x);
            }
            //continue ������һ��ѭ��
            //��ӡ����
            for (int J=0; J<20; J++){
            	if(0==J%3 || 0==J%5)
            		continue;
            	System.out.println(J);
            	//�����˫��������Ĵ��벻ִ�У�ֱ�ӽ�����һ��ѭ��
            }
            //break ����ѭ��
            //��ӡ����
            for (int k=1; k<10; k++){
            	if(0==k%2)
            		break;//�����˫��ֱ�ӽ���ѭ��
            	System.out.println(k);
            }
            //for Ƕ�� ���ѭ���ȿ�ʼ z =0 x =0 x = 1 ...x=9; z=1 x=0...
            for (int z = 0; z < 10; z++) {
                
                for (int x = 0; x < 10; x++) {
                    System.out.println(z+":"+x);
                    if(0==x%2) 
                        break; //�����˫����������ǰѭ��
                }  
            }
            //ʹ�ñ�ǩ����ѭ����ͬ��������continue
            outloop: //outloop�����ʾ�ǿ����Զ���ı���outloop1,ol2,out5
                for (int v = 0; v < 10; v++) {
                     
                    for (int q = 0; q < 10; q++) {
                        System.out.println(v+":"+q);
                        if(0==q%2) 
                            break outloop; //�����˫���������ⲿѭ��
                    }
                     
                }
            
	}

}
