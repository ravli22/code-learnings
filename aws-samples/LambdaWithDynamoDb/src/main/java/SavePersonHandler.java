import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.PutItemSpec;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SavePersonHandler implements RequestHandler<PersonRequest,PersonResponse> {

    private DynamoDB dynamoDB;
    private String DYNAMO_DB_TABLE_NAME = "Person";
    private Regions region = Regions.US_EAST_1;

    public PersonResponse handleRequest(PersonRequest personRequest, Context context) {
        this.initDynamoDbClient();

        persistData(personRequest);

        PersonResponse response = new PersonResponse();
        response.setMessage( "Person saved successfully!!" );
        return response;
    }

    private PutItemOutcome persistData(PersonRequest personRequest) {
        return dynamoDB.getTable( DYNAMO_DB_TABLE_NAME )
                .putItem( new PutItemSpec().withItem( new Item().withString( "firstName",personRequest.getFirstName() ).withString( "lastName",personRequest.getLastName() ) ) );
    }

    private void initDynamoDbClient() {
        AmazonDynamoDBClient client = new AmazonDynamoDBClient();
        client.setRegion( Region.getRegion( region ) );
        this.dynamoDB = new DynamoDB( client );
    }
}
