package animal;


public class Animal {
    // mainメソッドは不要
    // フィールドのカプセル化
    private String name;           // 名前
    private int age;               // 年齢


    // 引数2つがあるコンストラクタ
    public Animal(String name, int age) {
        // 処理内容として名前・年齢の各フィールドを引数の情報で初期化する
        this.name = name;
        this.age = age;
    }
    // sayメソッド(戻り値の指定は不要)
    public void say() {
        // 〇〇です。△△歳です。と画面に System.out.println() で表示する
        System.out.println(name + "です。" + age + "歳です。");
    }

}
