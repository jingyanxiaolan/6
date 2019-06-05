//4-2最优合并问题
//4
//例：5 12 11 2
//排序：2 5 11 12
//最多比较次数=(12+11-1)+(12+11+5-1)+(12+11+5+2-1)=78
//最少比较次数=(2+5-1)+(2+5+11-1)+(2+5+11+12-1)

#include <iostream>
#include <algorithm>
using namespace std;
//头文件#include <algorithm>
//sort(数组名，数组名+要排序的元素个数) 函数作用：递增排序
//reverse(数组名，数组名+要排序的元素个数) 函数作用：逆置数组
int main()
{
    int k;
    cin>>k;//输入k个待合并序列，比如4
    int* a=new int[k];
    int* b=new int[k];
    for(int i=0;i<k;i++)//当i=0,i<k,i++
    {
        cin>>a[i];//输入数组a[i]
        b[i]=a[i];//数组b[i]=a[i]
    }

    sort(a,a+k);//递增排序

    int min_sum=0;//最少比较次数的初值为0
    int min_mark=0;//最少比较次数的下标为0
    while(min_mark<k-1)//最少比较次数的下标小于k-1时
    {
        min_sum= min_sum+a[min_mark]+a[min_mark+1]-1;//最少比较次数=
        a[min_mark]=a[min_mark]+a[min_mark+1];
        a[min_mark+1]=0;
        min_mark++;
        sort(a,a+k);
    }
    sort(b,b+k);
    int max_sum=0;
    int max_mark=0;
    for(int h=1;h<=k-1;h++)
    {
        max_sum=max_sum+b[k-1]+b[k-2]-1;
        b[k-1]=b[k-1]+b[k-2];
        b[k-2]=0;
        sort(b,b+k);
    }
    cout<<max_sum<<" ";
    cout<<min_sum;
    return 0;
}
