public class Truk{

    double muatan;
    double muatanmaks; 

    public Truk(double beratmaks){
        muatanmaks=beratmaks; 
    }

    public double getMuatan (){

        return muatan;
    }

    public double getMuatanMaks (){
        
        return muatanmaks;
    }
    public void tambahMuatan (double berat){
 
        muatan += berat; //muatan = muatan +  berat
        if(muatan >= muatanmaks){ 
            muatan -=berat; // muatan = muatan - berat
        }
    }
    public void tambahMuatan1 (double berat){//pakai ini juga bisa 
        if((muatan + berat) <= muatanmaks){
            muatan += berat;// muatan= muatan+ berat
        }
    }


}