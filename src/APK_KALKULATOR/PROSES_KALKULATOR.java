
package APK_KALKULATOR;



public class PROSES_KALKULATOR {
    int operator=0;
    double angka1,angka2,angka3,result;
    String process;
    
    
    
    public void setNumber(String opr){
        if (!opr.equals("")){
            if(operator==0){
            angka1=Double.valueOf(opr);
            }else{
                angka2=Double.valueOf(opr);
            }
        }
    }
    
    public void setOperator(int opr){
        this.operator=opr;
    }
    public double getResult(){
       return result;
        
    }
    public void setResult(double hasil){
        this.result=hasil;
    }
    
    public void process(){
        switch (operator){
            case 1:
                result=angka1+angka2;
                process = "+";
                break;
            case 2:
                result=angka1-angka2;
                process="-";
                break;
            case 3:
                result=angka1*angka2;
                process="*";
                break;
            case 4:
                result=angka1/angka2;
                process="/";
                break;
            case 5:
                result=(angka1)/100;
                process="%";
                break;
            case 6:
                result=Math.pow(angka1,angka2);
                process="^";
                break;
                
            default:
                break;
                
        }
        angka3 = angka1;
        angka1 = result;
                
        }

   
    }
    

