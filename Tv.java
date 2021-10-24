/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;

/**
 *
 * @author Marco
 */
public class Tv 
{
    int channel;
    int voulmelevel;
    boolean on;
    public Tv()
    {
    channel=1;
    voulmelevel=1;
    on=false;
    }
    public void turnoff(){
    on=false;
    }
    public void turnon(){
    on=true;
    }
    public void setchannal(int newchannel){
    if(on&&newchannel>=1&&newchannel<=120)
        channel=newchannel;
    }
    public void setvoulme(int newvoulme){
    if(on&&newvoulme>=1&&newvoulme<=7)
        voulmelevel=newvoulme;
    }
    public void channelup(){
    if(on&&channel<120)
        channel++;
    }
    public void channeldown(){
    if(on&&channel>1)
        channel--;
    }
    public void volumeup(){
    if(on&&channel<7)
        voulmelevel++;
    }
    public void vdown(){
    if(on&&channel>1)
        voulmelevel--;
    }
}
