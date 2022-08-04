select * from Agent;

select * from Policy;

select * from AgentPolicy;

SELECT
   A.AgentID,FirstName,LastName,City,State,P.PolicyID,AppNumber,
   ModalPremium,PaymentModeID
FROM AGENT A INNER JOIN AGENTPOLICY AP
ON A.AgentID=AP.AgentID
INNER JOIN POLICY P ON
P.PolicyID=AP.PolicyID;

SELECT
   A.AgentID,FirstName,LastName,City,State,P.PolicyID,AppNumber,
   ModalPremium,PaymentModeID
FROM AGENT A LEFT JOIN AGENTPOLICY AP
ON A.AgentID=AP.AgentID
LEFT JOIN POLICY P ON
P.PolicyID=AP.PolicyID;

SELECT
   A.AgentID,FirstName,LastName,City,State,P.PolicyID,AppNumber,
   ModalPremium,PaymentModeID
FROM AGENT A RIGHT JOIN AGENTPOLICY AP
ON A.AgentID=AP.AgentID
RIGHT JOIN POLICY P ON
P.PolicyID=AP.PolicyID;

