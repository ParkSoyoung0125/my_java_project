package ch02_control_statement;

public class MultiIf01 {
    public static void main(String[] args) {
        int temperature = -8;
        String weather ;

        if (temperature >= 35) { // 35도 이상
            weather = "폭염 경보";
        } else if (temperature >= 30) { // 34 ~ 30도
            weather = "무더운 날씨";
        } else if (temperature >= 20) { // 29 ~ 20도
            weather= "쾌적한 날씨";
        } else if (temperature >= 10) { // 19 ~ 10도
            weather = "쌀쌀한 날씨";
        } else {                                            // 9도 이하
            weather = "추운 날씨";
        }
        String message = temperature + "도는 " + weather + "입니다.";
        System.out.println(message);

    }
}
