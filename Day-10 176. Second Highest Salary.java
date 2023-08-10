import pandas as pd

def second_highest_salary(employee: pd.DataFrame) -> pd.DataFrame:
    df=employee['salary'].sort_values(ascending=False).drop_duplicates()
    ans=None
    if len(df)>1:
        ans=df.iloc[1];#this will gice 2 value index start at 0
    return pd.DataFrame({'SecondHighestSalary' : [ans]});
