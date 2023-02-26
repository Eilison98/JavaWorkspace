package chap_01;

public class _Quiz_01
{
    public static void main(String[] args)
    {
        // 퀴즈1
        // 버스 도착 정보를 출력하는 프로그램을 작성하시오.
        // 각 정보는 적절한 자료형의 변수에 정의합니다.

        // 정보
        // 버스 번호는 "1234", "상암08"과 같은 형태
        // 남은 시간은 분 단위 (예: 3분, 5분)
        // 남은 거리는 km 단위 (예: 1.5km, 0.8km)
        
        
        String busNumber = "상암08"; // 버스번호
        int minute = 3; // 남은 시간
        double distance = 1.2; // 남은 거리

        System.out.println(busNumber + " 버스");
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
    }
}
