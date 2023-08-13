import pandas as pd

def order_scores(scores: pd.DataFrame) -> pd.DataFrame:
    r = 1
    scores = scores.sort_values('score', ascending=False)
    rank = []

    try:
        pv = scores['score'].iloc[0]
        for i in range(len(scores)):
            if pv != scores['score'].iloc[i]:
                r += 1
                pv = scores['score'].iloc[i]
            
            rank.append(r)
    except:
        pass

    scores['rank'] = rank
    return scores[['score', 'rank']]
