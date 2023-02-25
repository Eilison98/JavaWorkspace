package chap_01;

public class _03_Variables
{
    public static void main(String[] args)
    {
        // 문자열 변수 ( 여러글자 )
        String name;
        name = "ㅇㅇㅇ";

        // 정수형 변수
        int hour;
        hour = 15;

        // 실수형 변수
        double score;
        score = 90.5;

        // 문자형 변수 ( 작은글자 )
        char grade;
        grade = 'A';

        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        // 정밀한 값
        double d = 3.14123456789;

        float f = -3.1432415689F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
