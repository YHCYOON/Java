package ch06;

public class Ex6_1 {

	public static void main(String[] args) {
		Tv t;						// Tv �ν��Ͻ��� �����ϱ� ���� �������� t ����
		t = new Tv();			// Tv �ν��Ͻ��� ����
		t.channel = 7;			// Tv �ν��Ͻ��� ������� channel �� ���� 7�� ����
		t.channelDown();		// Tv �ν��Ͻ��� channelDown()�� ȣ��
		System.out.println("���� ä���� " + t.channel + " �Դϴ�");		
	}

}
0i
class Tv{
	// Tv�� �Ӽ�(�������)
	String color;		// ����
	boolean power;	// �������� (on/off)
	int channel;		// ä��
	
	// Tv�� ���(�޼���)
	void power() {			// TV�� �Ѱų� ���� ����� �ϴ� �޼���
		power = !power;
	}	
	
	void channelUp() {		// TV�� ä���� ���̴� ����� �ϴ� �޼���
		++channel;
	}
	
	void channelDown() {	// TV�� ä���� ���ߴ� ����� �ϴ� �޼���
		--channel;
	}
}

