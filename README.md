# Source code for www.brendondugan.com

## Why is this public?
There are many reasons I am choosing to publish the code for my site, but below are a few of the most compelling:
### Open Source Keeps Me Thinking About Quality
When anyone on the internet can view not only my current site code but also every commit I've made while trying to get 
there, it forces me to think about the best way to accomplish my goal rather than the fastest way. Open Source software 
gives my personal project the benefit that code peer-review gives my professional projects.
### Open Source Lets Me Help Others By Default
By publishing my source code on Github, I am making it easier for people who are learning any of the technologies I've 
used to see that same technology in action. Sometimes the best learning comes not from reading documentation, but from 
reading code that is working in production.
### I'd Be Honored If Someone Adapted My Code For Their Own Website
While there are tons of tools out there that facilitate setting up a good looking website with standard features, once
anyone who needs more flexibility than those tools provide will have a steep learning curve. By providing a pre-built 
framework I hope to simplify that somewhat for others. 

## How do I run it?
After downloading the code to an environment with Java 12 and Maven configured, run:
`mvn spring-boot:run` 
## Roadmap
As of version 2.0.2, this site will be more or less a direct port of the legacy site, with two notable changes:
 * The "Contact Me" page has been removed. I have never had legitimate communication occur as a result of this tool, and
 I link to plenty of third party services that would allow interested parties to reach me, so this is an unnecessary feature
 and an annoyance.
 * The /about endpoint now redirects to /about/me, and I have added /about/site which is a page about how the site was
 built and why the technical stack was chosen.
 
 Obviously, Java/Spring is a fairly heavy tech stack for serving what is essentially static html, so the following roadmap
 includes, among other things, some features I plan to implement in order to take better advantage of the tech stack.
 
 ### Planned Work
* Rewrite the CV page to be driven from the database
    * Define table structure to reduce duplication and allow cross-referencing of experience by specific technology
    * Add liquibase integration in order to make cross-environment DB change management possible and to provide no-fuss
    data insertion method
    * Define POJOs for CV structures and whip up JPA mappings in order to get data from the database
    * Refactor massive html monolith into reusable fragments in order to facilitate site redesign in the future
    * Hook up new controller which drives the CV via the data in the DB
    * Add a caching layer between database and controller which takes teh DB off of the critical path for most requests
* Upgrade from 4 year old LESS based version of Bootstrap to more modern Sass based version
    * Add Sass compilation build step in order to keep site styles up to date with the most recent .scss files
* Improve Music page
    * Extract YouTube video embed code into reusable fragment
    * Update to pull video details from DB
    * Integrate with YouTube API in order to automatically grab the details of new videos I upload and display them if 
    they are tagged with the music tag
    * Speed up page load
* Refactor "About Site" page to display this document
* Update all of the pictures to reflect that I now have a mustache attached to my beard and no longer look like a goat. 
