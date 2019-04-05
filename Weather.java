package temperatureassign;

public class Weather
{
    private String date_time;
    private double pressure;
    private double tempdegC;
    private double tempdegK;
    private double tdew;
    private double rh;
    private double vpmax;
    private double vpact;
    private double vpdef;
    private double sh;
    private double h2oc;
    private double rho;
    private double wv;
    private double max_wv;
    private double wd;

  /*  public Weather(double date_time, double pressure, double tempdegC, double tempdegK, double tdew, double rh, double vpmax,
                   double vpact, double vpdef, double sh, double h2oc, double rho, double wv, double max_wv, double wd)
                   */

    public Weather(String paramsList)
    {
        String[] params=paramsList.split(",");
        this.date_time = params[0];
        this.pressure = Double.parseDouble(params[1]);
       // this.pressure=params[1];
        this.tempdegC = Double.parseDouble(params[2]);
        this.tempdegK = Double.parseDouble(params[3]);
        this.tdew = Double.parseDouble(params[4]);
        this.rh = Double.parseDouble(params[5]);
        this.vpmax = Double.parseDouble(params[5]);
        this.vpact = Double.parseDouble(params[6]);
        this.vpdef = Double.parseDouble(params[7]);
        this.sh = Double.parseDouble(params[8]);
        this.h2oc = Double.parseDouble(params[9]);
        this.rho = Double.parseDouble(params[10]);
        this.wv = Double.parseDouble(params[11]);
        this.max_wv = Double.parseDouble(params[12]);
        this.wd = Double.parseDouble(params[13]);
    }

    public String getDate_time() {
        return String.valueOf(date_time);
    }

    public String getYear()
    {
       // System.out.println("Datetime: " + this.getDate_time() );
            String[] words = this.getDate_time().split(" ");
        //System.out.println(words[0]);
            String[] dateParts = words[0].split("\\.");
       // System.out.println(dateParts[2]);
            return dateParts[2];
    }
    public String getDay()
    {
      //System.out.println("Datetime: " + this.getDate_time() );
      String[] words = this.getDate_time().split(" ");
      //System.out.println(words[0]);
      String[] dateParts = words[0].split("\\.");
      //System.out.println(dateParts[0]);
      return dateParts[0];

    }
    public String getDate()
    {
        //System.out.println("Datetime: " + this.getDate_time() );
        String[] words = this.getDate_time().split(" ");
        //System.out.println(words[0]);
        return words[0];
    }

    public void setDate_time(String date_time)
    {
        this.date_time = date_time;
    }

    public double getPressure()
    {
        return pressure;
    }

    public void setPressure(double pressure)

    {
        this.pressure = pressure;
    }

    public double getTempdegC()
    {
        return tempdegC;
    }

    public void setTempdegC(double tempdegC)
    {
        this.tempdegC = tempdegC;
    }

    public double getTempdegK()
    {
        return tempdegK;
    }

    public void setTempdegK(double tempdegK)
    {
        this.tempdegK = tempdegK;
    }

    public double getTdew()
    {
        return tdew;
    }

    public void setTdew(double tdew)
    {
        this.tdew = tdew;
    }

    public double getRh()
    {
        return rh;
    }

    public void setRh(double rh) {
        this.rh = rh;
    }

    public double getVpmax() {
        return vpmax;
    }

    public void setVpmax(double vpmax) {
        this.vpmax = vpmax;
    }

    public double getVpact() {
        return vpact;
    }

    public void setVpact(double vpact) {
        this.vpact = vpact;
    }

    public double getVpdef() {
        return vpdef;
    }

    public void setVpdef(double vpdef) {
        this.vpdef = vpdef;
    }

    public double getSh() {
        return sh;
    }

    public void setSh(double sh) {
        this.sh = sh;
    }

    public double getH2oc() {
        return h2oc;
    }

    public void setH2oc(double h2oc) {
        this.h2oc = h2oc;
    }

    public double getRho() {
        return rho;
    }

    public void setRho(double rho) {
        this.rho = rho;
    }

    public double getWv() {
        return wv;
    }

    public void setWv(double wv) {
        this.wv = wv;
    }

    public double getMax_wv() {
        return max_wv;
    }

    public void setMax_wv(double max_wv) {
        this.max_wv = max_wv;
    }

    public double getWd() {
        return wd;
    }

    public void setWd(double wd) {
        this.wd = wd;
    }
}
