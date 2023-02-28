package animal;


public class Animal {
    // フィールド
    private String name;           // 名前
    private int age;               // 年齢


    // 引数2つがあるコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // sayメソッド(戻り値の指定は不要)
    public void say() {
        // 〇〇です。△△歳です。と表示する
        System.out.println(name + "です。" + age + "歳です。");
    }

}
