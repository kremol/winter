1、
保留小数点后3位
cout << fixed << setprecision(3) << sum << endl;

2、
map 遍历
map<string,int>::iterator it;

it = m.begin();

while(it != m.end())
{
    //it->first;
    //it->second;
    it ++;         
}

3、
string和int互转 
int n = atoi(s.c_str());
string s = to_string(n);

4、
前边有cin的话要先
cin.clear();
cin.sync();

string line;
getline(cin,line);