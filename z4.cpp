//4-2���źϲ�����
//4
//����5 12 11 2
//����2 5 11 12
//���Ƚϴ���=(12+11-1)+(12+11+5-1)+(12+11+5+2-1)=78
//���ٱȽϴ���=(2+5-1)+(2+5+11-1)+(2+5+11+12-1)

#include <iostream>
#include <algorithm>
using namespace std;
//ͷ�ļ�#include <algorithm>
//sort(��������������+Ҫ�����Ԫ�ظ���) �������ã���������
//reverse(��������������+Ҫ�����Ԫ�ظ���) �������ã���������
int main()
{
    int k;
    cin>>k;//����k�����ϲ����У�����4
    int* a=new int[k];
    int* b=new int[k];
    for(int i=0;i<k;i++)//��i=0,i<k,i++
    {
        cin>>a[i];//��������a[i]
        b[i]=a[i];//����b[i]=a[i]
    }

    sort(a,a+k);//��������

    int min_sum=0;//���ٱȽϴ����ĳ�ֵΪ0
    int min_mark=0;//���ٱȽϴ������±�Ϊ0
    while(min_mark<k-1)//���ٱȽϴ������±�С��k-1ʱ
    {
        min_sum= min_sum+a[min_mark]+a[min_mark+1]-1;//���ٱȽϴ���=
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
