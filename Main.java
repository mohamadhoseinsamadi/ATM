import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static int islangfarsi =1 ;
    //**** رمز در ابتدا 1234 است. لطفا به این نکته دقت کنید ****
    static String realpass="1234";

    //برای شروع موجودی رو گذاشتم 1میلیون و دویست
    static int pool=1_200_000;
    static String lastbardasht="";


    //این فرست اینپوت برای وقتی هست که میخاد رمزشو عوض کنه. میدونیم باید 2 بار رمز جدید رو بزنه
    static String firstinput="";
    static String secondinput="";
    //اگه این 2 تا با هم برابر بودند رمز عوض میشه، در غیر اینصورت اخطار های لازم داده میشه به کاربر

    public static void main(String[] args) {


        System.out.println(pool);
        Color abi=new Color(150,200,250);
        //
        JFrame frame =new JFrame();
        Dimension framesize=new Dimension(1000,600);
        frame.setSize(framesize);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        JPanel panel1=new JPanel();
        panel1.setSize(1000,600);
        panel1.setLayout(null);
        panel1.setBackground(abi);
        frame.add(panel1);


        //من این برنامه رو به زبان انگلیسی و فارسی هم نوشتم و هر کدوم رو که میخواهید میتونید انتخاب کنید
        JLabel chooselang=new JLabel();
        chooselang.setBounds(125,240,900,50);
        chooselang.setText("لطفا زبان خود را انتخاب کنید    Choose language");
        chooselang.setFont(new Font("r",Font.PLAIN,40));
        panel1.add(chooselang);
        //
        JButton farsi=new JButton("فارسی");
        farsi.setBounds(880,240,100,50);
        farsi.setFont(new Font("w",Font.PLAIN,30));
        panel1.add(farsi);

        JButton english=new JButton("English");
        english.setBounds(8,240,118,50);
        english.setFont(new Font("w",Font.PLAIN,25));
        panel1.add(english);
        //
        //
        //
        //
        JPanel panel2=new JPanel();
        panel2.setSize(1000,600);
        panel2.setLayout(null);
        panel2.setBackground(abi);
        frame.add(panel2);
        //
        JButton bazgasht=new JButton();
        bazgasht.setBounds(0,0,100,40);
        bazgasht.setFont(new Font("r",Font.TYPE1_FONT,25));

        //اینم دکمه ی بازگشت هست که به همه ی پنل ها (غیر از اول) اضافه کردم
        //
        JLabel ramz=new JLabel();
        ramz.setBounds(300,200,500,50);
        ramz.setFont(new Font("m",Font.PLAIN,45));
        panel2.add(ramz);

        JPasswordField inputramz=new JPasswordField();
        inputramz.setBounds(300,260,400,50);
        //اینجا رمز رو باید وارد کنید(اگه هنوز رمز رو عوض نکردید 1234 هست وگرنه همان رمزی که گذاشتید هست

        JButton sabt=new JButton();
        sabt.setBounds(430,350,140,50);
        sabt.setFont(new Font("m",Font.PLAIN,28));
        sabt.setBackground(Color.blue);

        //
        //اگه ثبت رو زدی ، اگه رمز رو درست وارد کرده باشی میری داخل وگرنه بهت اخطار میده
        JLabel warn=new JLabel();
        warn.setBounds(400,400,350,50);
        warn.setFont(new Font("m",Font.PLAIN,35));
        panel2.add(warn);
        //
        //
        //
        //پنل 3 برای انتخاب نوع عملیات هست
        JPanel panel3=new JPanel();
        panel3.setSize(1000,600);
        panel3.setLayout(null);
        panel3.setBackground(abi);
        //
        JButton ramzchange=new JButton();
        ramzchange.setBounds(770,200,230,50);
        ramzchange.setFont(new Font("m",Font.PLAIN,23));
        panel3.add(ramzchange);
        //
        JButton mojoodi =new JButton();
        mojoodi.setBounds(770,300,230,50);
        mojoodi.setFont(new Font("m",Font.PLAIN,27));
        panel3.add(mojoodi);
        //
        JButton bardasht=new JButton();
        bardasht.setBounds(0,200,220,50);
        bardasht.setFont(new Font("m",Font.PLAIN,25));
        panel3.add(bardasht);
        //
        JButton variz=new JButton();
        variz.setBounds(0,300,220,50);
        variz.setFont(new Font("m",Font.PLAIN,25));
        panel3.add(variz);
        //
        //
        //
        //پنل 4 برای تغییر رمز هست که کاراشو اونجا انجام میدم
        JPanel panel4_newPass=new JPanel();
        panel4_newPass.setSize(1000,600);
        panel4_newPass.setLayout(null);
        panel4_newPass.setBackground(abi);
        //
        JLabel inputnewramzlabel=new JLabel();
        inputnewramzlabel.setBounds(400,150,300,60);
        inputnewramzlabel.setFont(new Font("m",Font.PLAIN,30));
        panel4_newPass.add(inputnewramzlabel);
        //
        JPasswordField inputnewramztext=new JPasswordField();
        inputnewramztext.setBounds(320,220,400,50);
        panel4_newPass.add(inputnewramztext);

        //این دکمه رو برای این گذاشتم که رمز جدی رو برای اولین بار وارد کنه(باید 4 رقم باشه وگرنه هشدار میده
        JButton tagir1=new JButton();
        tagir1.setBounds(450,280,130,50);
        tagir1.setFont(new Font("m",Font.PLAIN,27));
        panel4_newPass.add(tagir1);
        //
        JLabel warnsizepass=new JLabel();
        warnsizepass.setBounds(350,380,430,50);
        warnsizepass.setFont(new Font("e",Font.BOLD,25));

        //برای بار دوم باید رمز جدید رو وارد کنه
        JLabel inputnewramzagainlabel=new JLabel();
        inputnewramzagainlabel.setBounds(350,250,350,50);
        inputnewramzagainlabel.setFont(new Font("m",Font.PLAIN,29));
        //
        JPasswordField inputnewramzagaintext=new JPasswordField();
        inputnewramzagaintext.setBounds(320,320,400,50);

        JButton tagirnahaee=new JButton();
        tagirnahaee.setBounds(400,400,250,50);
        tagirnahaee.setFont(new Font("m",Font.PLAIN,26));

        //اگه یکسان نبودند چی؟ برای همین اخطار زیر رو میدم
        JLabel notsame=new JLabel();
        notsame.setBounds(350,470,450,50);
        notsame.setFont(new Font("e",Font.BOLD,25));
        //
        //
        //این پنل برای نتیجه ی تغییر رمز هست(دقت کنید رمز شما ازاین به بعد دیگر همان رمز تغییر یافته است)
        // راستی از این پنل برای نتیجه کارت به کارت هم استفاده کردم چون حال نداشتم پنل جدید و لیبل جدید بسازم
        JPanel panel5_result=new JPanel();
        panel5_result.setSize(1000,600);
        panel5_result.setLayout(null);
        panel5_result.setBackground(abi);
        //این لیبل با توجه به زبان انتخابی با همان زبان میگوید که عملیات انجام شد
        JLabel processes=new JLabel();
        processes.setBounds(250,50,700,100);
        processes.setBackground(Color.red);
        processes.setFont(new Font("e",Font.BOLD,35));
        panel5_result.add(processes);
        //
        //
        //
        //
        JPanel panel6_poolmojood=new JPanel();
        panel6_poolmojood.setSize(1000,600);
        panel6_poolmojood.setLayout(null);
        panel6_poolmojood.setBackground(abi);
        //
        JLabel showpool=new JLabel();
        showpool.setBounds(300,350,800,100);
        showpool.setBackground(Color.red);
        showpool.setFont(new Font("e",Font.BOLD,35));
        //
        //
        //
        //
        JPanel panel7_bardashtvajh =new JPanel();
        panel7_bardashtvajh.setSize(1000,600);
        panel7_bardashtvajh.setLayout(null);
        panel7_bardashtvajh.setBackground(abi);

        JLabel mablaghbardasht=new JLabel();
        mablaghbardasht.setBounds(270,200,540,70);
        mablaghbardasht.setFont(new Font("e",Font.BOLD,27));
        panel7_bardashtvajh.add(mablaghbardasht);


        JButton sadtoman=new JButton("100,000");
        sadtoman.setBounds(800,100,200,50);
        sadtoman.setFont(new Font("e",Font.BOLD,30));
        panel7_bardashtvajh.add(sadtoman);

        JButton dahtoman=new JButton("10,000");
        dahtoman.setBounds(0,100,200,50);
        dahtoman.setFont(new Font("e",Font.BOLD,30));
        panel7_bardashtvajh.add(dahtoman);

        JButton panjahtoman=new JButton("50,000");
        panjahtoman.setBounds(0,300,200,50);
        panjahtoman.setFont(new Font("e",Font.BOLD,30));
        panel7_bardashtvajh.add(panjahtoman);

        JButton poonsadtoman=new JButton("500,000");
        poonsadtoman.setBounds(800,300,200,50);
        poonsadtoman.setFont(new Font("e",Font.BOLD,30));
        panel7_bardashtvajh.add(poonsadtoman);

        /*JButton other=new JButton();
        other.setFont(new Font("e",Font.BOLD,30));
        other.setBounds(380,450,240,60);
        panel7_bardashtvajh.add(other);*/
        //این هم برای سایر مبالغ بود ولی راستش وقت نکردم بسازمش چون باید تکالیف سایر دروس رو انجام میدادم
        //
        //
        JPanel panel8_estelam=new JPanel();
        panel8_estelam.setSize(1000,600);
        panel8_estelam.setLayout(null);
        panel8_estelam.setBackground(abi);

        JLabel poolebardashti=new JLabel();
        poolebardashti.setBounds(270,200,600,70);
        poolebardashti.setFont(new Font("e",Font.BOLD,27));
        panel8_estelam.add(poolebardashti);
        //
        //
        //
        //
        JPanel panel9_cartbecart=new JPanel();
        panel9_cartbecart.setSize(1000,600);
        panel9_cartbecart.setLayout(null);
        panel9_cartbecart.setBackground(abi);

        JLabel mabdalabel=new JLabel();
        mabdalabel.setBounds(270,100,540,70);
        mabdalabel.setFont(new Font("e",Font.BOLD,27));
        panel9_cartbecart.add(mabdalabel);


        JTextField mabdafield=new JTextField();
        mabdafield.setBounds(200,200,500,60);
        panel9_cartbecart.add(mabdafield);


        JLabel magsadlabel=new JLabel();
        magsadlabel.setBounds(270,300,540,70);
        magsadlabel.setFont(new Font("e",Font.BOLD,27));
        panel9_cartbecart.add(magsadlabel);


        JTextField magsadfield=new JTextField();
        magsadfield.setBounds(200,400,500,60);
        panel9_cartbecart.add(magsadfield);

        JButton ok=new JButton();
        ok.setBounds(450,500,100,60);
        ok.setFont(new Font("e",Font.BOLD,27));
        panel9_cartbecart.add(ok);



        //اینجا اگه انگلیسی رو انتخاب کرده باشه، نوشته ها میرن روی دکمه ها و لیبل ها و...
        // میخاستم با if(islangfarsi==1) و... برم ولی هرکاری کردم نشد
        //روش دیگه ای بلد نبودم که بشه اینکارو کرد، اگه میدونید بگید لطفا
        english.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                islangfarsi =0;
                bazgasht.setText("Exit");
                frame.remove(panel1);
                frame.revalidate();
                frame.repaint();
                frame.add(panel2);
                panel2.add(bazgasht);
                panel2.add(inputramz);
                panel2.add(sabt);
                sabt.setText("Register");
                variz.setText("Transfer");
                bazgasht.setText("Exit");
                ramz.setText("Enter your password");
                bardasht.setText("withdraw money");
                inputnewramzlabel.setText("Enter New Password");
                tagir1.setText("confirm");
                ramzchange.setText("changing password");
                warnsizepass.setText("size of password should be 4 digit !");
                inputnewramzagainlabel.setText("Enter new Password Again");
                tagirnahaee.setText("Change Password");
                notsame.setText("The two passwords are not the same !");
                processes.setText("Proces finished successfully.");
                mojoodi.setText("Balance");
                showpool.setText("you have " + pool);
                //other.setText("other amount");
                mablaghbardasht.setText("Enter the desired amount for withdrawal.");
                mabdalabel.setText("Enter your card number");
                magsadlabel.setText("Enter destination card number");
                ok.setText("ok");


            }
        });
        farsi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                islangfarsi=1;
                frame.remove(panel1);
                frame.revalidate();
                frame.repaint();
                frame.add(panel2);
                panel2.add(bazgasht);
                panel2.add(inputramz);
                panel2.add(sabt);
                bazgasht.setText("بازگشت");
                ramz.setText("رمز خود را وارد کنید");
                bardasht.setText("برداشت وجه");
                sabt.setText("ثبت");
                variz.setText("کارت به کارت");
                tagir1.setText("تایید");
                warnsizepass.setText("اندازه ی رمز باید 4 رقم باشد !");
                inputnewramzagainlabel.setText("رمز جدید را مجددا وارد کنید");
                ramzchange.setText("تغییر رمز");
                tagirnahaee.setText("تغییر رمز");
                notsame.setText("این 2 رمز یکسان نیستند !");
                inputnewramzlabel.setText("رمز جدید را وارد کنید");
                processes.setText("عملیات با موفقیت انجام شد .");
                mojoodi.setText("موجودی");
                showpool.setText("موجودی حساب شما : "+pool);
                //other.setText("سایر مبالغ");
                mablaghbardasht.setText("مبلغ مورد نظر برای برداشت را وارد نمایید");
                mabdalabel.setText("شماره کارت مبدا را وارد کنید");
                magsadlabel.setText("شماره کارت مقصد را وارد کنید");
                ok.setText("تایید");


            }
        });





        sabt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entered_pass = inputramz.getText();
                if (entered_pass.equals(realpass)) {
                    frame.remove(panel2);
                    frame.revalidate();
                    frame.repaint();
                    frame.add(panel3);
                    panel3.add(bazgasht);
                }
                else {
                    if (islangfarsi == 1)
                        warn.setText("رمز صحیح نمیباشد");
                    if (islangfarsi == 0)
                        warn.setText("Password is incorrect");
                }
            }
        });

        // اینجا وقتی بازگشت رو میزنیم هرچی هست رو حذف میکنه و تکست فیلد ها رو هم خالی میکنه
        bazgasht.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel2);
                frame.remove(panel3);
                frame.remove(panel4_newPass);
                frame.remove(panel5_result);
                frame.remove(panel6_poolmojood);
                frame.remove(panel7_bardashtvajh);
                frame.remove(panel8_estelam);
                frame.remove(panel9_cartbecart);
                panel4_newPass.remove(inputnewramzagainlabel);
                panel4_newPass.remove(inputnewramzagaintext);
                panel4_newPass.remove(warnsizepass);
                panel4_newPass.remove(notsame);
                panel4_newPass.remove(tagirnahaee);
                panel4_newPass.add(inputnewramzlabel);
                panel4_newPass.add(inputnewramztext);
                panel4_newPass.add(tagir1);
                panel7_bardashtvajh.remove(poolebardashti);
                inputramz.setText("");
                warn.setText("");
                inputnewramztext.setText("");
                inputnewramzagaintext.setText("");
                poolebardashti.setText("");
                magsadfield.setText("");
                mabdafield.setText("");
                frame.revalidate();
                frame.repaint();
                frame.add(panel1);
            }
        });

        ramzchange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                frame.revalidate();
                frame.repaint();
                frame.add(panel4_newPass);
                panel4_newPass.add(bazgasht);
            }
        });
        tagir1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstinput=inputnewramztext.getText();
                if(firstinput.length()==4){
                    frame.revalidate();
                    frame.repaint();
                    panel4_newPass.remove(inputnewramztext);
                    panel4_newPass.remove(inputnewramzlabel);
                    panel4_newPass.remove(tagir1);
                    panel4_newPass.remove(warnsizepass);
                    panel4_newPass.add(inputnewramzagainlabel);
                    panel4_newPass.add(inputnewramzagaintext);
                    panel4_newPass.add(tagirnahaee);
                }
                else{
                    frame.revalidate();
                    frame.repaint();
                    panel4_newPass.add(warnsizepass);
                }
            }
        });
        tagirnahaee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondinput=inputnewramzagaintext.getText();
                if(secondinput.equals(firstinput)){
                    frame.remove(panel4_newPass);
                    realpass=secondinput;
                    frame.repaint();
                    frame.revalidate();
                    frame.add(panel5_result);
                    panel5_result.add(bazgasht);
                }
                else {
                    frame.revalidate();
                    frame.repaint();
                    panel4_newPass.add(notsame);
                }
            }
        });
        mojoodi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.revalidate();
                frame.repaint();
                frame.remove(panel3);
                frame.add(panel6_poolmojood);
                panel6_poolmojood.add(showpool);
                panel6_poolmojood.add(bazgasht);

            }
        });
        bardasht.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.revalidate();
                frame.repaint();
                frame.remove(panel3);
                frame.add(panel7_bardashtvajh);
                panel7_bardashtvajh.add(bazgasht);
            }
        });

        dahtoman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //نمیذارم موجودی منفی بشه ، پس در نتیجه باید مبلغ برداشتی از موجودی بیشتر یا مساوی باشه
                if (pool >= 10000) {
                    lastbardasht = "10000";
                    pool -= 10_000;
                    frame.remove(panel7_bardashtvajh);
                    frame.revalidate();
                    frame.repaint();
                    frame.add(panel8_estelam);
                    panel8_estelam.add(processes);
                    panel8_estelam.add(poolebardashti);
                    panel8_estelam.add(bazgasht);
                    if (islangfarsi == 1)
                        poolebardashti.setText("مبلغ برداشت از حساب : " + lastbardasht);
                    else
                        poolebardashti.setText("The amount of money withdrawn : " + lastbardasht);
                }
            }
        });
        sadtoman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pool >= 100000) {
                    lastbardasht = "100000";
                    pool -= 100_000;
                    frame.remove(panel7_bardashtvajh);
                    frame.revalidate();
                    frame.repaint();
                    frame.add(panel8_estelam);
                    panel8_estelam.add(processes);
                    panel8_estelam.add(poolebardashti);
                    panel8_estelam.add(bazgasht);
                    if (islangfarsi == 1)
                        poolebardashti.setText("مبلغ برداشت از حساب : " + lastbardasht);
                    else
                        poolebardashti.setText("The amount of money withdrawn : " + lastbardasht);

                }
            }
        });
        panjahtoman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pool > 50000) {
                    lastbardasht = "50000";
                    pool -= 50_000;
                    frame.remove(panel7_bardashtvajh);
                    frame.revalidate();
                    frame.repaint();
                    frame.add(panel8_estelam);
                    panel8_estelam.add(processes);
                    panel8_estelam.add(poolebardashti);
                    panel8_estelam.add(bazgasht);
                    if (islangfarsi == 1)
                        poolebardashti.setText("مبلغ برداشت از حساب : " + lastbardasht);
                    else
                        poolebardashti.setText("The amount of money withdrawn : " + lastbardasht);
                }
            }
        });
        poonsadtoman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pool > 500000) {
                    lastbardasht = "500000";
                    pool -= 500_000;
                    frame.remove(panel7_bardashtvajh);
                    frame.revalidate();
                    frame.repaint();
                    frame.add(panel8_estelam);
                    panel8_estelam.add(processes);
                    panel8_estelam.add(poolebardashti);
                    panel8_estelam.add(bazgasht);
                    if (islangfarsi == 1)
                        poolebardashti.setText("مبلغ برداشت از حساب : " + lastbardasht);
                    else
                        poolebardashti.setText("The amount of money withdrawn : " + lastbardasht);
                }
            }
        });

        variz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                frame.revalidate();
                frame.repaint();
                frame.add(panel9_cartbecart);
                panel9_cartbecart.add(bazgasht);
            }
        });
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel9_cartbecart);
                frame.revalidate();
                frame.repaint();
                frame.add(bazgasht);
                frame.add(panel5_result);
            }
        });
//میتونستم برای انتقال شرط 16 رقمی و بذارم(مثل تغییررمز که شرط 4 رقمی گذاشتم)ولی باید برم سراغ تمرین فایل



        frame.setVisible(true);
    }
}