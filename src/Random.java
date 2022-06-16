class Solution{
    public:
    int isPossible(long long S, long long N, long long X, long long A[])
    {
        vector<long long>v;
        v.push_back(S);
        long long current =S;
        for(long long i = 0;i<N;i++)
        {
            long long temp = current+A[i];
            v.push_back(temp);
            if(temp>=X)break;
            current=current+temp;
        }
        long long i=v.size()-1;
        while(i>=0 && X>0)
        {
            if(X>=v[i])
            {
                X=X-v[i];

            }
            i--;
        }
        if(X==0)return 1;
        return 0 ;
    }
};

