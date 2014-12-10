class Battle{
    int multiplier=1;
    public int advCheck(boolean pArray1[],boolean cArray[]){
        //Fire types advantage over PC
        if(pArray1[1]==true){
            if(cArray[3]){multiplier++;}//grass
            if(cArray[4]){multiplier++;}//ice
            if(cArray[13]){multiplier++;}//bug
            if(cArray[11]){multiplier++;}//steel
        }    

        if(pArray1[2]==true){
            if(cArray[1]){multiplier++;}//fire
            if(cArray[10]){multiplier++;}//ground
            if(cArray[9]){multiplier++;}//rock

        }

        if(pArray1[3]==true){
            if(cArray[2]){multiplier++;}//grass
            if(cArray[9]){multiplier++;}//ice
            if(cArray[10]){multiplier++;}//bug

        }

        if(pArray1[4]==true){
            if(cArray[3]){multiplier++;}//grass
            if(cArray[11]){multiplier++;}//ice
            if(cArray[5]){multiplier++;}//bug
            if(cArray[16]){multiplier++;}
        }

        if(pArray1[5]==true){
            if(cArray[5]){multiplier++;}//grass

        }

        if(pArray1[6]==true){
            if(cArray[13]){multiplier++;}
        }

        if(pArray1[7]==true){
            if(cArray[6]){multiplier++;}//grass
            if(cArray[8]){multiplier++;}//ice

        }

        if(pArray1[8]==true){
            if(cArray[14]){multiplier++;}//grass
            if(cArray[12]){multiplier++;}//ice
            if(cArray[6]){multiplier++;}//bug

        }

        if(pArray1[9]==true){
            if(cArray[13]){multiplier++;}//grass

            if(cArray[1]){multiplier++;}//bug
            if(cArray[16]){multiplier++;}
        }
        
        if(pArray1[10]==true){
            if(cArray[9]){multiplier++;}//grass
            if(cArray[12]){multiplier++;}//ice
            if(cArray[1]){multiplier++;}//bug
            
        }
        
        if(pArray1[11]==true){
            if(cArray[9]){multiplier++;}//grass
            if(cArray[7]){multiplier++;}//ice
            if(cArray[12]){multiplier++;}//bug
            
        }
        
        if(pArray1[12]==true){
            if(cArray[3]){multiplier++;}//grass
        }
        
        if(pArray1[13]==true){
            if(cArray[3]){multiplier++;}//grass
            
        }
        
        if(pArray1[14]==true){
            if(cArray[0]){multiplier++;}//grass
            if(cArray[9]){multiplier++;}//ice
            if(cArray[11]){multiplier++;}//bug
            
        }
        
        if(pArray1[15]==true){
            if(cArray[2]){multiplier++;}//grass
            
            if(cArray[4]){multiplier++;}//bug
            if(cArray[16]){multiplier++;}
        }
        
        if(pArray1[16]==true){
            if(cArray[3]){multiplier++;}//grass
            if(cArray[14]){multiplier++;}//ice
            if(cArray[13]){multiplier++;}//bug
            
        }
        
        return multiplier;
    }  
}