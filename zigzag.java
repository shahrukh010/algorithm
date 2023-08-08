


int n = s.length();
        if(numRows==1) return s;

        StringBuilder [] arr = new StringBuilder[numRows];

        for(int i=0; i<numRows; i++){
            arr[i] = new StringBuilder("");
        }

        boolean flag = false;
        int size = 0;

        for(int i=0; i<n; i++){
            arr[size].append(s.charAt(i));
            if(size==0 || size==numRows-1){
                //changing direction at boundries
                flag = !flag;
            }
            if(flag) size++;
            else size--;
        }
        
        StringBuilder res = new StringBuilder();
        for(int i=0; i<numRows; i++){
            res.append(arr[i]);
        }

        return res.toString();
    }
